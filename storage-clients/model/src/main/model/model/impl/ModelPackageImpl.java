/**
 */
package model.impl;

import java.util.Map;

import model.Affinity;
import model.Application;
import model.Cluster;
import model.ElementWithResources;
import model.Host;
import model.Message;
import model.ModelFactory;
import model.Service;
import model.ServiceReplica;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelPackageImpl eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ClusterImpl
	 * @see model.impl.ModelPackageImpl#getCluster()
	 * @generated
	 */
	public static final int CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER__APPLICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER__HOSTS = 1;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ApplicationImpl
	 * @see model.impl.ModelPackageImpl#getApplication()
	 * @generated
	 */
	public static final int APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.ElementWithResourcesImpl <em>Element With Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ElementWithResourcesImpl
	 * @see model.impl.ModelPackageImpl#getElementWithResources()
	 * @generated
	 */
	public static final int ELEMENT_WITH_RESOURCES = 8;

	/**
	 * The feature id for the '<em><b>Resource Limit</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_WITH_RESOURCES__RESOURCE_LIMIT = 0;

	/**
	 * The number of structural features of the '<em>Element With Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_WITH_RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ServiceImpl
	 * @see model.impl.ModelPackageImpl#getService()
	 * @generated
	 */
	public static final int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Resource Limit</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE__RESOURCE_LIMIT = ELEMENT_WITH_RESOURCES__RESOURCE_LIMIT;

	/**
	 * The feature id for the '<em><b>Affinities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE__AFFINITIES = ELEMENT_WITH_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE__NAME = ELEMENT_WITH_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_FEATURE_COUNT = ELEMENT_WITH_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.impl.AffinityImpl <em>Affinity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AffinityImpl
	 * @see model.impl.ModelPackageImpl#getAffinity()
	 * @generated
	 */
	public static final int AFFINITY = 3;

	/**
	 * The feature id for the '<em><b>With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AFFINITY__WITH = 0;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AFFINITY__DEGREE = 1;

	/**
	 * The number of structural features of the '<em>Affinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AFFINITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.ServiceReplicaImpl <em>Service Replica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ServiceReplicaImpl
	 * @see model.impl.ModelPackageImpl#getServiceReplica()
	 * @generated
	 */
	public static final int SERVICE_REPLICA = 4;

	/**
	 * The feature id for the '<em><b>Resource Limit</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REPLICA__RESOURCE_LIMIT = SERVICE__RESOURCE_LIMIT;

	/**
	 * The feature id for the '<em><b>Affinities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REPLICA__AFFINITIES = SERVICE__AFFINITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REPLICA__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REPLICA__MESSAGES = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REPLICA__METRICS = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REPLICA__CONTAINER = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REPLICA__ID = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Replica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REPLICA_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link model.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MessageImpl
	 * @see model.impl.ModelPackageImpl#getMessage()
	 * @generated
	 */
	public static final int MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE__RESPONSE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE__MESSAGE_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE__TIMESTAMP = 5;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link model.impl.HostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.HostImpl
	 * @see model.impl.ModelPackageImpl#getHost()
	 * @generated
	 */
	public static final int HOST = 6;

	/**
	 * The feature id for the '<em><b>Resource Limit</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST__RESOURCE_LIMIT = ELEMENT_WITH_RESOURCES__RESOURCE_LIMIT;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST__SERVICES = ELEMENT_WITH_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST__METRICS = ELEMENT_WITH_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST__NAME = ELEMENT_WITH_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_FEATURE_COUNT = ELEMENT_WITH_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link model.impl.StringToLongMapImpl <em>String To Long Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StringToLongMapImpl
	 * @see model.impl.ModelPackageImpl#getStringToLongMap()
	 * @generated
	 */
	public static final int STRING_TO_LONG_MAP = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_LONG_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_LONG_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Long Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_LONG_MAP_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affinityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceReplicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToLongMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementWithResourcesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.impl.ModelPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ((EFactory)ModelFactory.INSTANCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackageImpl init() {
		if (isInited) return (ModelPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ModelPackageImpl.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackageImpl.eNS_URI, theModelPackage);
		return theModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link model.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see model.Cluster
	 * @generated
	 */
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cluster#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see model.Cluster#getApplications()
	 * @see #getCluster()
	 * @generated
	 */
	public EReference getCluster_Applications() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cluster#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosts</em>'.
	 * @see model.Cluster#getHosts()
	 * @see #getCluster()
	 * @generated
	 */
	public EReference getCluster_Hosts() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see model.Application
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link model.Application#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see model.Application#getServices()
	 * @see #getApplication()
	 * @generated
	 */
	public EReference getApplication_Services() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see model.Service
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link model.Service#getAffinities <em>Affinities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affinities</em>'.
	 * @see model.Service#getAffinities()
	 * @see #getService()
	 * @generated
	 */
	public EReference getService_Affinities() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.Affinity <em>Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affinity</em>'.
	 * @see model.Affinity
	 * @generated
	 */
	public EClass getAffinity() {
		return affinityEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link model.Affinity#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>With</em>'.
	 * @see model.Affinity#getWith()
	 * @see #getAffinity()
	 * @generated
	 */
	public EReference getAffinity_With() {
		return (EReference)affinityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Affinity#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see model.Affinity#getDegree()
	 * @see #getAffinity()
	 * @generated
	 */
	public EAttribute getAffinity_Degree() {
		return (EAttribute)affinityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.ServiceReplica <em>Service Replica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Replica</em>'.
	 * @see model.ServiceReplica
	 * @generated
	 */
	public EClass getServiceReplica() {
		return serviceReplicaEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link model.ServiceReplica#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see model.ServiceReplica#getMessages()
	 * @see #getServiceReplica()
	 * @generated
	 */
	public EReference getServiceReplica_Messages() {
		return (EReference)serviceReplicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the map '{@link model.ServiceReplica#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Metrics</em>'.
	 * @see model.ServiceReplica#getMetrics()
	 * @see #getServiceReplica()
	 * @generated
	 */
	public EReference getServiceReplica_Metrics() {
		return (EReference)serviceReplicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.ServiceReplica#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see model.ServiceReplica#getContainer()
	 * @see #getServiceReplica()
	 * @generated
	 */
	public EAttribute getServiceReplica_Container() {
		return (EAttribute)serviceReplicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.ServiceReplica#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.ServiceReplica#getId()
	 * @see #getServiceReplica()
	 * @generated
	 */
	public EAttribute getServiceReplica_Id() {
		return (EAttribute)serviceReplicaEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link model.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see model.Message
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link model.Message#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see model.Message#getSource()
	 * @see #getMessage()
	 * @generated
	 */
	public EReference getMessage_Source() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link model.Message#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see model.Message#getDestination()
	 * @see #getMessage()
	 * @generated
	 */
	public EReference getMessage_Destination() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	public EAttribute getMessage_Name() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Message#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see model.Message#getResponseTime()
	 * @see #getMessage()
	 * @generated
	 */
	public EAttribute getMessage_ResponseTime() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Message#getMessageSize <em>Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Size</em>'.
	 * @see model.Message#getMessageSize()
	 * @see #getMessage()
	 * @generated
	 */
	public EAttribute getMessage_MessageSize() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Message#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see model.Message#getTimestamp()
	 * @see #getMessage()
	 * @generated
	 */
	public EAttribute getMessage_Timestamp() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link model.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see model.Host
	 * @generated
	 */
	public EClass getHost() {
		return hostEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link model.Host#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see model.Host#getServices()
	 * @see #getHost()
	 * @generated
	 */
	public EReference getHost_Services() {
		return (EReference)hostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the map '{@link model.Host#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Metrics</em>'.
	 * @see model.Host#getMetrics()
	 * @see #getHost()
	 * @generated
	 */
	public EReference getHost_Metrics() {
		return (EReference)hostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Host#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Host#getName()
	 * @see #getHost()
	 * @generated
	 */
	public EAttribute getHost_Name() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Long Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Long Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.ELongObject"
	 * @generated
	 */
	public EClass getStringToLongMap() {
		return stringToLongMapEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToLongMap()
	 * @generated
	 */
	public EAttribute getStringToLongMap_Key() {
		return (EAttribute)stringToLongMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToLongMap()
	 * @generated
	 */
	public EAttribute getStringToLongMap_Value() {
		return (EAttribute)stringToLongMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.ElementWithResources <em>Element With Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element With Resources</em>'.
	 * @see model.ElementWithResources
	 * @generated
	 */
	public EClass getElementWithResources() {
		return elementWithResourcesEClass;
	}

	/**
	 * Returns the meta object for the map '{@link model.ElementWithResources#getResourceLimit <em>Resource Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Resource Limit</em>'.
	 * @see model.ElementWithResources#getResourceLimit()
	 * @see #getElementWithResources()
	 * @generated
	 */
	public EReference getElementWithResources_ResourceLimit() {
		return (EReference)elementWithResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clusterEClass = createEClass(CLUSTER);
		createEReference(clusterEClass, CLUSTER__APPLICATIONS);
		createEReference(clusterEClass, CLUSTER__HOSTS);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__SERVICES);
		createEAttribute(applicationEClass, APPLICATION__NAME);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__AFFINITIES);
		createEAttribute(serviceEClass, SERVICE__NAME);

		affinityEClass = createEClass(AFFINITY);
		createEReference(affinityEClass, AFFINITY__WITH);
		createEAttribute(affinityEClass, AFFINITY__DEGREE);

		serviceReplicaEClass = createEClass(SERVICE_REPLICA);
		createEReference(serviceReplicaEClass, SERVICE_REPLICA__MESSAGES);
		createEReference(serviceReplicaEClass, SERVICE_REPLICA__METRICS);
		createEAttribute(serviceReplicaEClass, SERVICE_REPLICA__CONTAINER);
		createEAttribute(serviceReplicaEClass, SERVICE_REPLICA__ID);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__SOURCE);
		createEReference(messageEClass, MESSAGE__DESTINATION);
		createEAttribute(messageEClass, MESSAGE__NAME);
		createEAttribute(messageEClass, MESSAGE__RESPONSE_TIME);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_SIZE);
		createEAttribute(messageEClass, MESSAGE__TIMESTAMP);

		hostEClass = createEClass(HOST);
		createEReference(hostEClass, HOST__SERVICES);
		createEReference(hostEClass, HOST__METRICS);
		createEAttribute(hostEClass, HOST__NAME);

		stringToLongMapEClass = createEClass(STRING_TO_LONG_MAP);
		createEAttribute(stringToLongMapEClass, STRING_TO_LONG_MAP__KEY);
		createEAttribute(stringToLongMapEClass, STRING_TO_LONG_MAP__VALUE);

		elementWithResourcesEClass = createEClass(ELEMENT_WITH_RESOURCES);
		createEReference(elementWithResourcesEClass, ELEMENT_WITH_RESOURCES__RESOURCE_LIMIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceEClass.getESuperTypes().add(this.getElementWithResources());
		serviceReplicaEClass.getESuperTypes().add(this.getService());
		hostEClass.getESuperTypes().add(this.getElementWithResources());

		// Initialize classes and features; add operations and parameters
		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCluster_Applications(), this.getApplication(), null, "applications", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_Hosts(), this.getHost(), null, "hosts", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(clusterEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getServiceReplica(), "service", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHost(), "destination", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(clusterEClass, null, "exchange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getServiceReplica(), "serviceA", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getServiceReplica(), "serviceB", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(clusterEClass, null, "provision", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "resources", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(clusterEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(clusterEClass, null, "updateResources", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementWithResources(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "resources", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Services(), this.getService(), null, "services", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Affinities(), this.getAffinity(), null, "affinities", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affinityEClass, Affinity.class, "Affinity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAffinity_With(), this.getService(), null, "with", null, 0, 1, Affinity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffinity_Degree(), ecorePackage.getEFloatObject(), "degree", null, 0, 1, Affinity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceReplicaEClass, ServiceReplica.class, "ServiceReplica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceReplica_Messages(), this.getMessage(), null, "messages", null, 0, -1, ServiceReplica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceReplica_Metrics(), this.getStringToLongMap(), null, "metrics", null, 0, -1, ServiceReplica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceReplica_Container(), ecorePackage.getEString(), "container", null, 0, 1, ServiceReplica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceReplica_Id(), ecorePackage.getEString(), "id", null, 0, 1, ServiceReplica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Source(), this.getServiceReplica(), null, "source", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Destination(), this.getServiceReplica(), null, "destination", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_ResponseTime(), ecorePackage.getELongObject(), "responseTime", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_MessageSize(), ecorePackage.getELongObject(), "messageSize", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Timestamp(), ecorePackage.getELongObject(), "timestamp", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostEClass, Host.class, "Host", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHost_Services(), this.getServiceReplica(), null, "services", null, 0, -1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHost_Metrics(), this.getStringToLongMap(), null, "metrics", null, 0, -1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Name(), ecorePackage.getEString(), "name", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToLongMapEClass, Map.Entry.class, "StringToLongMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToLongMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToLongMap_Value(), ecorePackage.getELongObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementWithResourcesEClass, ElementWithResources.class, "ElementWithResources", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementWithResources_ResourceLimit(), this.getStringToLongMap(), null, "resourceLimit", null, 0, -1, ElementWithResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (applicationEClass, 
		   source, 
		   new String[] {
			 "archetype", "Role"
		   });
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ClusterImpl
		 * @see model.impl.ModelPackageImpl#getCluster()
		 * @generated
		 */
		public static final EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CLUSTER__APPLICATIONS = eINSTANCE.getCluster_Applications();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CLUSTER__HOSTS = eINSTANCE.getCluster_Hosts();

		/**
		 * The meta object literal for the '{@link model.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ApplicationImpl
		 * @see model.impl.ModelPackageImpl#getApplication()
		 * @generated
		 */
		public static final EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPLICATION__SERVICES = eINSTANCE.getApplication_Services();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '{@link model.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ServiceImpl
		 * @see model.impl.ModelPackageImpl#getService()
		 * @generated
		 */
		public static final EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Affinities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE__AFFINITIES = eINSTANCE.getService_Affinities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link model.impl.AffinityImpl <em>Affinity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AffinityImpl
		 * @see model.impl.ModelPackageImpl#getAffinity()
		 * @generated
		 */
		public static final EClass AFFINITY = eINSTANCE.getAffinity();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AFFINITY__WITH = eINSTANCE.getAffinity_With();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AFFINITY__DEGREE = eINSTANCE.getAffinity_Degree();

		/**
		 * The meta object literal for the '{@link model.impl.ServiceReplicaImpl <em>Service Replica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ServiceReplicaImpl
		 * @see model.impl.ModelPackageImpl#getServiceReplica()
		 * @generated
		 */
		public static final EClass SERVICE_REPLICA = eINSTANCE.getServiceReplica();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_REPLICA__MESSAGES = eINSTANCE.getServiceReplica_Messages();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_REPLICA__METRICS = eINSTANCE.getServiceReplica_Metrics();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_REPLICA__CONTAINER = eINSTANCE.getServiceReplica_Container();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_REPLICA__ID = eINSTANCE.getServiceReplica_Id();

		/**
		 * The meta object literal for the '{@link model.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MessageImpl
		 * @see model.impl.ModelPackageImpl#getMessage()
		 * @generated
		 */
		public static final EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MESSAGE__SOURCE = eINSTANCE.getMessage_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MESSAGE__DESTINATION = eINSTANCE.getMessage_Destination();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MESSAGE__RESPONSE_TIME = eINSTANCE.getMessage_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MESSAGE__MESSAGE_SIZE = eINSTANCE.getMessage_MessageSize();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MESSAGE__TIMESTAMP = eINSTANCE.getMessage_Timestamp();

		/**
		 * The meta object literal for the '{@link model.impl.HostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.HostImpl
		 * @see model.impl.ModelPackageImpl#getHost()
		 * @generated
		 */
		public static final EClass HOST = eINSTANCE.getHost();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOST__SERVICES = eINSTANCE.getHost_Services();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOST__METRICS = eINSTANCE.getHost_Metrics();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST__NAME = eINSTANCE.getHost_Name();

		/**
		 * The meta object literal for the '{@link model.impl.StringToLongMapImpl <em>String To Long Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.StringToLongMapImpl
		 * @see model.impl.ModelPackageImpl#getStringToLongMap()
		 * @generated
		 */
		public static final EClass STRING_TO_LONG_MAP = eINSTANCE.getStringToLongMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STRING_TO_LONG_MAP__KEY = eINSTANCE.getStringToLongMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STRING_TO_LONG_MAP__VALUE = eINSTANCE.getStringToLongMap_Value();

		/**
		 * The meta object literal for the '{@link model.impl.ElementWithResourcesImpl <em>Element With Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ElementWithResourcesImpl
		 * @see model.impl.ModelPackageImpl#getElementWithResources()
		 * @generated
		 */
		public static final EClass ELEMENT_WITH_RESOURCES = eINSTANCE.getElementWithResources();

		/**
		 * The meta object literal for the '<em><b>Resource Limit</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ELEMENT_WITH_RESOURCES__RESOURCE_LIMIT = eINSTANCE.getElementWithResources_ResourceLimit();

	}

} //ModelPackageImpl
