package org.almansa.designpattern.gof.abstract_decorator;

public class UniqueItemList extends AbstractListDecorator{

	public UniqueItemList(List decorated) {
		super(decorated);		
	}

	@Override
	public void add(Object item) {
		if (super.contains(item)) {
			throw new IllegalArgumentException("item must not be null");
		}
		
		super.add(item);
	}
}
