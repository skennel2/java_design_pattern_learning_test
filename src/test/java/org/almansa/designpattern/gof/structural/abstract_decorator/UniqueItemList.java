package org.almansa.designpattern.gof.structural.abstract_decorator;

public class UniqueItemList extends AbstractListDecorator {

	public UniqueItemList(List decorated) {
		super(decorated);
	}

	public static List decorate(List list) {
		return new UniqueItemList(list);
	}

	@Override
	public void add(Object item) {
		if (super.contains(item)) {
			throw new IllegalArgumentException("item must not be null");
		}

		super.add(item);
	}
}
