package org.almansa.designpattern.gof.structural.composite.basic;

import java.util.ArrayList;
import java.util.List;

public class ComponentComposit implements Component {

	private List<Component> components = new ArrayList<>();	
	
	public void addComponent(Component component) {
		this.components.add(component);
	}
	
	public void removeComponent(Component component) {
		this.components.remove(component);
	}
	
	@Override
	public void operation() {
		for(Component component : this.components) {
			component.operation();
		}
	}

}
