import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateDefaultConnectionBaseBuilder;
import com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateEntityManagerProperties;
import com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateModuleExclusions;
import com.jwebmp.guicedpersistence.services.PropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.readers.hibernateproperties {
	requires com.jwebmp.guicedpersistence;
	requires com.jwebmp.guicedinjection;
	requires java.validation;

	exports com.jwebmp.guicedpersistence.readers.hibernateproperties;

	provides PropertiesConnectionInfoReader with HibernateDefaultConnectionBaseBuilder;
	provides PropertiesEntityManagerReader with HibernateEntityManagerProperties;

	provides IGuiceScanJarExclusions with HibernateModuleExclusions;
	provides IGuiceScanModuleExclusions with HibernateModuleExclusions;
}
