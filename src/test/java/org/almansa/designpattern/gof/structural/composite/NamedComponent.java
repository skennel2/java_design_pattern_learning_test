package org.almansa.designpattern.gof.structural.composite;

public class NamedComponent implements Component {

	private String name;
	
	public NamedComponent(String name) {
		super();
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println(this.name.concat(" work"));
	}

}
