package org.almansa.designpattern.gof.abstract_decorator;

/**
 * 파생될 자식 Decorator들의 뼈대가 된다.
 * 파생될 자식 클래스에서 재정의 할수 있는 메소드들은 데코레이터 패턴으로 확장될 수 있는 확장점이다.  
 * @author skennel
 *
 */
public abstract class AbstractListDecorator implements List {

	private List decorated;

	public AbstractListDecorator(List decorated) {
		if (decorated == null) {
			throw new IllegalArgumentException("List must not be null");
		}

		this.decorated = decorated;
	}
	
	protected List getList() {
		return decorated;
	}
	
	@Override
	public Object get(int index) {
		return decorated.get(index);
	}

	@Override
	public void remove(int index) {
		decorated.remove(index);
	}

	@Override
	public void add(Object item) {
		decorated.add(item);
	}

	/*
	 * final로 선언한 메소드는 확장될 수 없다.	 
	 */
	@Override
	final public void clear() {
		decorated.clear();
	}
	
	@Override
	public boolean contains(Object item) {	
		return decorated.contains(item);
	}
	
	@Override
	public int size() {	
		return decorated.size();
	}
}
