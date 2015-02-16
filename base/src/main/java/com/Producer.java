package com;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Producer {
	
	@Inject
	Writer writer;
	
    public boolean someLibraryMethod() {
		Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        writer = container.instance().select(Writer.class).get();
        weld.shutdown();
        writer.something();
        return true;
    }
}
