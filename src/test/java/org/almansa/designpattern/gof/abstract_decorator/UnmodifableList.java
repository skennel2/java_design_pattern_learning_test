package org.almansa.designpattern.gof.abstract_decorator;

public class UnmodifableList extends AbstractListDecorator{

	public UnmodifableList(List decorated) {
		super(decorated);
	}

	public static List decorate(List list) {
		return new UnmodifableList(list);
	}
	
	@Override
	public void add(Object item) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void remove(int index) {
		throw new UnsupportedOperationException();
	}
}
