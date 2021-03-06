package com.guicedee.guicedpersistence.readers.hibernateproperties;


import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class HibernateModuleExclusions
		implements com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions<HibernateModuleExclusions>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.guicedee.guicedpersistence.readers.hibernateproperties");
		return strings;
	}
}
