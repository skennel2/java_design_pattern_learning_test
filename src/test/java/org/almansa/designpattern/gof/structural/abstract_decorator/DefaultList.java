package org.almansa.designpattern.gof.structural.abstract_decorator;

import java.util.ArrayList;

public class DefaultList implements List {

	private ArrayList<Object> list = new ArrayList<>();

	@Override
	public boolean contains(Object item) {
		return list.contains(item);
	}

	@Override
	public Object get(int index) {
		return list.get(index);
	}

	@Override
	public void remove(int index) {
		list.remove(index);
	}

	@Override
	public void add(Object item) {
		list.add(item);
	}

	@Override
	public void clear() {
		list.clear();
	}

	@Override
	public int size() {
		return list.size();
	}

}
