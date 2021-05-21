package org.almansa.designpattern.gof.structural.composite;

import org.junit.Test;

public class TestClient {
	
	@Test
	public void test() {
		NamedComponent component1 = new NamedComponent("component1");
		NamedComponent component2 = new NamedComponent("component2");
		NamedComponent component3 = new NamedComponent("component3");
		
		ComponentComposit componentComposite = new ComponentComposit();
		componentComposite.addComponent(component1);
		componentComposite.addComponent(component2);
		componentComposite.addComponent(component3);
		
		ComponentComposit componentComposite2 = new ComponentComposit();
		componentComposite2.addComponent(componentComposite);
		
		componentComposite2.operation();
		
	}
}
