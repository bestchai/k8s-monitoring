package cas.ibm.ubc.ca.zipkin;

import java.util.List

import java.util.concurrent.CountDownLatch
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

import cas.ibm.ubc.ca.interfaces.MessagesInspectionInterface
import cas.ibm.ubc.ca.interfaces.messages.TimeInterval

import cas.ibm.ubc.ca.zipkin.pogos.Annotation
import cas.ibm.ubc.ca.zipkin.pogos.Endpoint
import cas.ibm.ubc.ca.zipkin.pogos.Message
import cas.ibm.ubc.ca.zipkin.pogos.Trace

public class ZipkinClient implements MessagesInspectionInterface {
	//http://www.vogella.com/tutorials/JavaLibrary-OkHttp/article.html
	// http://zipkin.io/zipkin-api/#/paths/

	private ZipkinRequestor requestor
	private int limit = 1000
	public ZipkinClient(host, port, timeout, limit, TimeUnit timeunit) {
		requestor = new ZipkinRequestor(host, port, timeout, timeunit)
		this.limit = limit
	}
	
	public ZipkinClient(host, port, limit = 1000) {
		this(host, port, 10, limit, TimeUnit.SECONDS)
	}

	@Override
	public List messages(TimeInterval timeInterval) {
		messages(null, timeInterval)
	}

	@Override
	public List messages(String serviceInstance, TimeInterval timeInterval) {
		def params = [
			endTs: timeInterval.getEnd(),
			lookback: timeInterval.getIntervalInMillis(),
			limit: limit
		]
		def tracesList = requestor.getTraces(params)
		def messages = []
		
		Random random = new Random(System.currentTimeMillis())
		tracesList.each { trace ->
			trace.each { span ->
				def clientSendAnnotation = span.annotations.find {
					it.value == 'cs'
				}
				if(!clientSendAnnotation || serviceInstance && \
					clientSendAnnotation?.serviceName() != serviceInstance)
					return

				def message = new Message()
				message.correlationId = span.traceId
				message.timestamp = span.timestamp
				message.totalTime = span.duration
				message.sourceIp = clientSendAnnotation.endpoint.ipv4
				message.sourceName = clientSendAnnotation.endpoint.serviceName
				fetchTotalSizeFromDbQueryResultSizeAnnotation(message, span)
				fetchTotalSizeFromContentLengthAnnotations(message, span)

				def serverEndpoint = findServerEndpoint(span, trace)
				message.targetIp = serverEndpoint?.ipv4
				message.targetName = serverEndpoint?.serviceName
				fetchTargetNameFromPeerAddressAnnotation(message, span)

				messages << message
			}
		}
		messages
	}

	public static getServiceName(List annotations) {
		annotations.inject([]) { result, a ->
			
			def m = [serviceName:(a.endpoint.serviceName)]
//			m["ip"] = (a.endpoint.ipv4)
			m["value"] = a.value
			result << m
		}
	}
	
	public static printTrace(List<Trace> trace) {
		trace.each { Trace t->

			print "[${getServiceName(t.annotations)}][${getServiceName(t.binaryAnnotations)}] -> "
		}
		println ""
	}
	
//	public static void main(String[] args) throws Exception {
//		
//		ZipkinClient client = new ZipkinClient("10.66.66.32", 30002, 10000, TimeUnit.SECONDS)
//		println client.messages(TimeInterval.last(2, TimeUnit.DAYS))				 
//	}

	private Endpoint findServerEndpoint(span, trace) {
		def childSpan = trace.find { it.parentId == span.id }
		def spanServerEndpoint = span.getServerEndpoint()
		def childSpanServerEndpoint = childSpan?.getServerEndpoint()

		spanServerEndpoint ?: childSpanServerEndpoint
	}

	private void fetchTargetNameFromPeerAddressAnnotation(message, span) {
		if(message.targetName)
			return

		def peerAddress = span.binaryAnnotations.find {
			it.key == 'peer.address'
		}?.value
		if(peerAddress == null)
			return

		message.targetName = peerAddress.split(':')[0]
	}

	private void fetchTotalSizeFromDbQueryResultSizeAnnotation(message, span) {
		def size = span.binaryAnnotations.find {
			it.key == 'db.query.result.size'
		}?.value
		if(size == null)
			return

		message.totalSize = Long.valueOf(size)
	}

	private void fetchTotalSizeFromContentLengthAnnotations(message, span) {
		if(message.totalSize != null)
			return
		def requestSize = span.binaryAnnotations.find {
			it.key == 'http.content-length'
		}?.value
		def responseSize = span.binaryAnnotations.find {
			it.key == 'http.response.content-length'
		}?.value
		if (requestSize == null || responseSize == null)
			return

		message.totalSize = Long.valueOf(requestSize) + Long.valueOf(responseSize)
	}
}
