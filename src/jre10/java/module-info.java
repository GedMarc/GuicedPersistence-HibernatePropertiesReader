import com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateDefaultConnectionBaseBuilder;
import com.jwebmp.guicedpersistence.readers.hibernateproperties.HibernateEntityManagerProperties;
import com.jwebmp.guicedpersistence.services.PropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.readers.hibernateproperties {
	requires transitive com.jwebmp.guicedpersistence;

	exports com.jwebmp.guicedpersistence.readers.hibernateproperties;

	requires transitive org.hibernate.orm.core;
	requires transitive org.hibernate.validator;

	provides PropertiesConnectionInfoReader with HibernateDefaultConnectionBaseBuilder;
	provides PropertiesEntityManagerReader with HibernateEntityManagerProperties;

}
