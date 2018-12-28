package org.almansa.designpattern.gof.abstract_decorator;

public class NotNullableList extends AbstractListDecorator {

	public NotNullableList(List decorated) {
		super(decorated);
	}

	@Override
	public void add(Object item) {
		if (item == null) {
			throw new IllegalArgumentException("item must not be null");
		}

		super.add(item);
	}	
}
