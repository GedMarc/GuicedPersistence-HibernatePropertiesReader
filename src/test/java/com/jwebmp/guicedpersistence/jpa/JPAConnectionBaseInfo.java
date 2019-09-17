package com.jwebmp.guicedpersistence.jpa;

import com.jwebmp.guicedpersistence.db.ConnectionBaseInfo;
import com.jwebmp.logger.LogFactory;

import javax.sql.DataSource;
import java.util.logging.Logger;

public class JPAConnectionBaseInfo
		extends ConnectionBaseInfo
{
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
