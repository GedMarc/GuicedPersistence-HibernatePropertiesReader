module com.guicedee.guicedpersistence.readers.hibernateproperties {
	requires com.guicedee.guicedpersistence;
	requires com.guicedee.guicedinjection;
	requires java.validation;

	exports com.guicedee.guicedpersistence.readers.hibernateproperties;

	provides com.guicedee.guicedpersistence.services.IPropertiesConnectionInfoReader with com.guicedee.guicedpersistence.readers.hibernateproperties.HibernateDefaultConnectionBaseBuilder;
	provides com.guicedee.guicedpersistence.services.IPropertiesEntityManagerReader with com.guicedee.guicedpersistence.readers.hibernateproperties.HibernateEntityManagerProperties;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.guicedee.guicedpersistence.readers.hibernateproperties.HibernateModuleExclusions;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.guicedee.guicedpersistence.readers.hibernateproperties.HibernateModuleExclusions;
}
