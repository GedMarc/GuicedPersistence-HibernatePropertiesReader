module com.jwebmp.guicedpersistence.readers.hibernateproperties {
	requires com.jwebmp.guicedpersistence;
	requires com.jwebmp.guicedinjection;
	requires java.validation;

	exports com.jwebmp.guicedpersistence.readers.hibernateproperties;

	provides com.jwebmp.guicedpersistence.services.IPropertiesConnectionInfoReader with com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateDefaultConnectionBaseBuilder;
	provides com.jwebmp.guicedpersistence.services.IPropertiesEntityManagerReader with com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateEntityManagerProperties;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateModuleExclusions;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateModuleExclusions;
}
