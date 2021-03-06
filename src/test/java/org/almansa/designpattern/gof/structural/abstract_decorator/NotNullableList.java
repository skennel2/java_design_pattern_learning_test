package org.almansa.designpattern.gof.structural.abstract_decorator;

public class NotNullableList extends AbstractListDecorator {

	public NotNullableList(List decorated) {
		super(decorated);
	}

	public static List decorate(List list) {
		return new NotNullableList(list);
	}

	@Override
	public void add(Object item) {
		if (item == null) {
			throw new IllegalArgumentException("item must not be null");
		}

		super.add(item);
	}
}
