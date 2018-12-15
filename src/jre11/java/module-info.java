import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateDefaultConnectionBaseBuilderI;
import com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateEntityManagerIProperties;
import com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateModuleExclusions;
import com.jwebmp.guicedpersistence.services.IPropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.services.IPropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.readers.hibernateproperties {
	requires com.jwebmp.guicedpersistence;
	requires com.jwebmp.guicedinjection;
	requires java.validation;

	exports com.jwebmp.guicedpersistence.readers.hibernateproperties;

	provides IPropertiesConnectionInfoReader with HibernateDefaultConnectionBaseBuilderI;
	provides IPropertiesEntityManagerReader with HibernateEntityManagerIProperties;

	provides IGuiceScanJarExclusions with HibernateModuleExclusions;
	provides IGuiceScanModuleExclusions with HibernateModuleExclusions;
}
