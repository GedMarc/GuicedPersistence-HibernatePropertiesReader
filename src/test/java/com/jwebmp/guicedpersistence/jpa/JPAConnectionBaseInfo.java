package com.guicedee.jpms.guicedpersistence.jpa;

import com.guicedee.jpms.guicedpersistence.db.ConnectionBaseInfo;
import com.guicedee.jpms.logger.LogFactory;

import javax.sql.DataSource;
import java.util.logging.Logger;

public class JPAConnectionBaseInfo
		extends ConnectionBaseInfo
{
	private static final Logger log = LogFactory.getLog("JPAConnectionBaseInfo");
	private boolean driverRegistered;

	/**
	 * You can fetch it directly from the entity manager using (DataSource)managerFactory.getConnectionFactory()
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public DataSource toPooledDatasource()
	{
		return null;
	}
}
