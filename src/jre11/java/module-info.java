import com.guicedee.guicedpersistence.readers.hibernateproperties.HibernateDefaultConnectionBaseBuilder;
import com.guicedee.guicedpersistence.readers.hibernateproperties.HibernateEntityManagerProperties;
import com.guicedee.guicedpersistence.readers.hibernateproperties.HibernateModuleExclusions;

module com.guicedee.guicedpersistence.readers.hibernateproperties {
	requires com.guicedee.guicedpersistence;
	requires com.guicedee.guicedinjection;
	requires java.validation;
	requires com.guicedee.guicedpersistence;

	exports com.guicedee.guicedpersistence.readers.hibernateproperties;

	provides com.guicedee.guicedpersistence.services.IPropertiesConnectionInfoReader with HibernateDefaultConnectionBaseBuilder;
	provides com.guicedee.guicedpersistence.services.IPropertiesEntityManagerReader with HibernateEntityManagerProperties;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with HibernateModuleExclusions;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with HibernateModuleExclusions;
}
