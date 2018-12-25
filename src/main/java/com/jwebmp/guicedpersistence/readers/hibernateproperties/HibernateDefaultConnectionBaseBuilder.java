package com.jwebmp.guicedpersistence.readers.hibernateproperties;

import com.jwebmp.guicedpersistence.db.ConnectionBaseInfo;
import com.jwebmp.guicedpersistence.services.IPropertiesConnectionInfoReader;
import com.oracle.jaxb21.PersistenceUnit;

import java.util.Properties;

/**
 * Reads the default connection properties for hibernate and configures the connection accordingly
 */
public class HibernateDefaultConnectionBaseBuilder
		implements IPropertiesConnectionInfoReader
{

	@Override
	public ConnectionBaseInfo populateConnectionBaseInfo(PersistenceUnit unit, Properties filteredProperties, ConnectionBaseInfo cbi)
	{
		for (String prop : filteredProperties.stringPropertyNames())
		{
			switch (prop)
			{
				case "hibernate.connection.url":
				{
					if (cbi.getUrl() == null)
					{
						cbi.setUrl(filteredProperties.getProperty(prop));
					}
					break;
				}
				case "hibernate.connection.user":
				{
					if (cbi.getUsername() == null)
					{
						cbi.setUsername(filteredProperties.getProperty(prop));
					}
					break;
				}
				case "hibernate.connection.driver_class":
				{
					if (cbi.getDriverClass() == null)
					{
						cbi.setDriverClass(filteredProperties.getProperty(prop));
					}
					break;
				}
				default:
				{
					break;
				}
			}
		}
		return cbi;
	}
}
