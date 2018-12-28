package org.almansa.designpattern.gof.abstract_decorator;

public interface List {
	boolean contains(Object item);

	Object get(int index);

	void remove(int index);

	void add(Object item);

	void clear();

	int size();
}
