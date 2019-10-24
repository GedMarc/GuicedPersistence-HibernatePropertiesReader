package com.guicedee.jpms.guicedpersistence.jpa;

import com.guicedee.jpms.guicedinjection.GuiceContext;
import com.guicedee.jpms.logger.LogFactory;
import com.guicedee.jpms.logger.logging.LogColourFormatter;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;

public class GuicedPersistenceBindingTest
{
	@Test
	public void testMe()
	{
		LogFactory.configureConsoleSingleLineOutput(Level.FINE);
		LogColourFormatter.setRenderBlack(false);
		GuiceContext.inject();
	}
}
