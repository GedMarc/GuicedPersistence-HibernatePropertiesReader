package com.jwebmp.guicedpersistence.jpa;

import com.jwebmp.guicedinjection.GuiceContext;
import com.jwebmp.logger.LogFactory;
import com.jwebmp.logger.logging.LogColourFormatter;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import java.util.logging.Level;

public class GuicedPersistenceBindingTest
{
	@Test
	public void testMe()
	{
		LogFactory.configureConsoleSingleLineOutput(Level.FINE);
		LogColourFormatter.setRenderBlack(false);
		GuiceContext.inject();
		EntityManager em = GuiceContext.get(EntityManager.class, TestCustomPersistenceLoader.class);
		System.out.println(em.isOpen());

	}
}
