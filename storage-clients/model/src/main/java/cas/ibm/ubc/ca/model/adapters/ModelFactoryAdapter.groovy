package cas.ibm.ubc.ca.model.adapters

import org.eclipse.emf.common.notify.Adapter
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.common.notify.impl.AdapterImpl
import org.eclipse.emf.common.notify.impl.NotificationImpl
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.impl.EAttributeImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EContentAdapter
import org.eclipse.emf.ecore.util.EcoreUtil
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import model.Affinity
import model.Application
import model.Cluster
import model.Host
import model.Message
import model.ModelFactory
import model.Service
import model.ServiceInstance
import model.impl.ClusterImpl
import model.impl.MessageImpl
import model.impl.ServiceImpl
import model.impl.StringToServiceImpl
import model.impl.StringToServiceInstanceImpl

// abstracts the ModelFactory to automatically add the adapters
// to the EObjects instances
class ModelFactoryAdapter implements ModelFactory {
	private static final Logger LOG = LoggerFactory.getLogger(AdapterImpl.class)

	private static final ModelFactory factory = ModelFactory.INSTANCE
	static final ModelFactory INSTANCE = new ModelFactoryAdapter()

	// http://www.vogella.com/tutorials/EclipseEMFNotification/article.html
	private EContentAdapter serviceAdapter = new EContentAdapter() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification)

			def newValue = notification.getNewValue()
			def oldValue = notification.getOldValue()

			Notifier notifier = notification.getNotifier()

			// this code doesn't handle messages removed from the model

			// updating service by adding a new message
			if(notification.getEventType() == Notification.ADD
				&& notifier instanceof ServiceInstance
				&& newValue instanceof Message) {
				synchronized(notifier) {
					notifier.totalMessages += 1L
					notifier.totalData += newValue != null ? newValue.messageSize : 0 
				}
			}
			// updating service by setting the message values (reference)
			else if(notification.getEventType() == Notification.SET
					&& notifier instanceof Message
					&& notification.getFeature().getName() == "messageSize") {
				synchronized(notifier) {
					Service service = notifier.eContainer()
					service.totalData += newValue != null ? newValue : 0
				}
				
			}
		}
	}

	private EContentAdapter hostAdapter = new EContentAdapter() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification)

			def newValue = notification.getNewValue()
			def oldValue = notification.getOldValue()

			Notifier notifier = notification.getNotifier()

			// this code doesn't handle messages removed from the model
			// updating application by adding a new service

			if(notification.getEventType() == Notification.ADD
			&& notifier instanceof Host
			&& newValue instanceof StringToServiceInstanceImpl) {
				
				ServiceInstance service = newValue.value
				synchronized(service) {
					service.setHost(notifier)
				}
			}
		}
	}

	private EContentAdapter applicationAdapter = new EContentAdapter() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification)

			def newValue = notification.getNewValue()
			def oldValue = notification.getOldValue()

			Notifier notifier = notification.getNotifier()

			// this code doesn't handle messages removed from the model
			// updating application by adding a new service
			if(notification.getEventType() == Notification.ADD
			&& notifier instanceof Application
			&& newValue instanceof StringToServiceImpl) {



				ServiceInstance service = newValue.value
				synchronized(service) {
					service.setApplication(notifier.getName())
				}

				synchronized(notifier) {
					notifier.totalMessages += service.totalMessages
					notifier.totalData += newValue.value.totalData
				}
			}
			// updating application by setting the service values (reference)
			else if(notification.getEventType() == Notification.SET
			&& notifier instanceof Service) {

				Application application = notifier.eContainer().eContainer()

				synchronized(application) {
					if(notification.getFeature().getName() == "totalMessages") {
						synchronized(application) {
							application.totalMessages += (newValue - oldValue)
						}
					}
					else if(notification.getFeature().getName() == "totalData") {
						synchronized(application) {
							application.totalData += (newValue - oldValue)
						}
					}
				}
			}
		}
	}

	private Adapter adapter = new AdapterImpl() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification)
//			LOG.debug "${notification}"
		}
	}

	private ModelFactoryAdapter() { }
	
	private void addToResource(Resource resource, EObject element) {
		if(resource) {
			while(true) {
				try {
					resource.getContents().add(0, element)
					break
				}
				catch(Exception e) {
					
				}
			}
		}
	}

	@Override
	public Cluster createCluster() {
		Cluster cluster = factory.createCluster()
		cluster.eAdapters().add(adapter)
		return cluster
	}
	
	public Cluster createCluster(res) {
		Cluster cluster = createCluster()
		addToResource(res, cluster)
		return cluster
	}

	@Override
	public Application createApplication() {
		Application application = factory.createApplication()
		application.eAdapters().add(adapter)
		application.eAdapters().add(applicationAdapter)
		return application
	}
	
	public Application createApplication(Resource res) {
		Application application = createApplication() 
		addToResource(res, application)
		return application
	}

	@Override
	public Affinity createAffinity() {
		Affinity affinity = factory.createAffinity()
		affinity.eAdapters().add(adapter)
		return affinity;
	}
	
	public Affinity createAffinity(Resource res) {
		Affinity affinity = createAffinity()
		addToResource(res, affinity)
		return affinity
	}

	@Override
	public ServiceInstance createServiceInstance() {
		ServiceInstance serviceInstance = factory.createServiceInstance()
		serviceInstance.eAdapters().add(adapter)
		serviceInstance.eAdapters().add(serviceAdapter)
		return serviceInstance

	}
	
	public ServiceInstance createServiceInstance(Resource res) {
		ServiceInstance serviceInstance = createServiceInstance()
		addToResource(res, serviceInstance)
		return serviceInstance
	}

	@Override
	public Message createMessage() {
		Message message = factory.createMessage()
//		message.eAdapters().add(adapter)
		return message
	}
	
	public Message createMessage(Resource res) {
		Message message = createMessage()
		addToResource(res, message)
		return message
	}

	@Override
	public Host createHost() {
		Host host = factory.createHost()
		host.eAdapters().add(adapter)
		host.eAdapters().add(hostAdapter)
		return host
	}
	
	public Host createHost(Resource res) {
		Host host = createHost()
		addToResource(res, host)
		return host
	}

}
