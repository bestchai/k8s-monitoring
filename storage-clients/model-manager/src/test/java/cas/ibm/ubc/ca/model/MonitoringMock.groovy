package cas.ibm.ubc.ca.model

import java.lang.reflect.Type
import java.util.List
import java.util.Map
import java.util.concurrent.TimeUnit
import cas.ibm.ubc.ca.interfaces.InspectionInterface
import cas.ibm.ubc.ca.interfaces.messages.TimeInterval
import cas.ibm.ubc.ca.zipkin.pogos.Message
import groovy.transform.Memoized

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonWriter

class MonitoringMock implements InspectionInterface {

	private String jsonApplications
	private String jsonHosts
	private String jsonServices
	private String jsonMetrics
//	private Map jsonMessages
	private String jsonMessages

	public MonitoringMock() {
		jsonApplications = loadJson("applications.json").text
		jsonHosts = loadJson("hosts.json").text
		jsonServices = loadJson("services.json").text
		jsonMetrics = loadJson("metrics.json").text
//		jsonMessages = loadJson("messages_100000000.json").text
	}

	private File loadJson(String path) {
		ClassLoader cl = this.class.getClassLoader()
		new File(cl.getResource(path).getFile())
	}

	private def parseJson(Type type, String json) {
		new Gson().fromJson(json, type);
	}

	@Override
	public List hosts() {
		Type type = new TypeToken<List>(){}.getType();
		return parseJson(type, jsonHosts)
	}

	@Override
	public List services() {
		Type type = new TypeToken<List<Map>>(){}.getType();
		return parseJson(type, jsonServices)
	}

	@Override
	public Map<String, Float> applications() {
		Type type = new TypeToken<Map<String, Float>>(){}.getType();
		return parseJson(type, jsonApplications)
	}

	@Override
	public String cluster() {
		"KUBERNETES"
	}

	private final static Random r = new Random(31*17)
	private Message randomMessage(List services, String source) {

		String sourceName = source
		String targetName

		int t = services.size()

		targetName = services[Math.abs(r.nextInt() % t)]
		
		if(!sourceName)
			sourceName = services[Math.abs(r.nextInt() % t)]
			
		while(sourceName == targetName) {
			sourceName = services[Math.abs(r.nextInt() % t)]
			targetName = services[Math.abs(r.nextInt() % t)]
		}

		def m = new Message(
				["correlationId": Math.abs(r.nextLong()),
					"timestamp": System.currentTimeMillis(),
					"totalTime": Math.abs(r.nextLong()%100),
					"totalSize": Math.abs(r.nextLong()%10),
					"targetIp": "0.0.0.0",
					"sourceIp": "0.0.0.0",
					"sourceName": sourceName,
					"targetName": targetName]
				)
		return m
	}

	public List messages(TimeInterval timeInterval) {
		messages(null, timeInterval)
	}
	
	public List messages(String serviceInstance, TimeInterval timeInterval) {
		InputStream inputStream = new FileInputStream("/home/adalrsjr1/Code/ibm-stack/storage-clients/model-manager/src/test/resources/messages_100000000.json")
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))
		
		List l = new LinkedList()
		Gson gson = new Gson()
		Type type = new TypeToken<Message>(){}.getType();
		for(int i = 0; i < timeInterval.getIntervalInMillis(); i++) {
			l.add(0, gson.fromJson(br.readLine(), type))
		}
		
		br.close()
		inputStream.close()
		return l
	}

//	public List messages(String serviceInstance, TimeInterval timeInterval) {
//		def services = services().findAll{ it.application == "sock-shop" }
//		.collect([]) { it.uid}
//
//		return (1..timeInterval.getIntervalInMillis()).collect([]) {
//			randomMessage(services, serviceInstance)
//		}
//	}

	private Map extractMetrics(String context, String measurement, TimeInterval timeInterval) {
		Type type = new TypeToken<Map>(){}.getType();
		Map metrics = parseJson(type, jsonMetrics)

		String[] measures = measurement.split("/")

		return metrics[context][measures[0]][measures[1]]
	}

	@Override
	public Map<String, Double> metricsService(Measurement measurement, TimeInterval timeInterval) {
		return extractMetrics("services", measurement, timeInterval)
	}

	@Override
	public Map<String, Double> metricsHost(Measurement measurement, TimeInterval timeInterval) {
		return extractMetrics("hosts", measurement, timeInterval)
	}

	@Override
	public Double metricService(String id, Measurement measurement, TimeInterval timeInterval) {
		return extractMetrics("services", measurement, timeInterval)[id]
	}

	@Override
	public Double metricHost(String id, Measurement measurement, TimeInterval timeInterval) {
		return extractMetrics("hosts", measurement, timeInterval)[id]
	}

	@Override
	public String environment() {
		return "KUBERNETES";
	}
}