package org.almansa.designpattern.gof.structural.abstract_decorator;

import org.junit.Test;

// 일반적으로 데코레이터클래스를 이용하여 특정 인스턴스의 기능을 확장하는 주체는 개발자이다. 
// 이것이 Proxy와의 큰 차이이다. 
public class TestClient {
	
	@Test(expected = IllegalArgumentException.class)
	public void notNullableList() {
		List notNullableList = NotNullableList.decorate(new DefaultList());
		notNullableList.add(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void uniqueItemList() {
		List uniqueItemList = UniqueItemList.decorate(new DefaultList());
		uniqueItemList.add("Hi");
		uniqueItemList.add("Hi");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void decorator_체이닝() {
		List uniqueItemList = UniqueItemList.decorate(new DefaultList());		
		List uniqueAndNotNullable = NotNullableList.decorate(uniqueItemList);		
		uniqueAndNotNullable.add(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void decorator_체이닝2() {
		List uniqueItemList = UniqueItemList.decorate(new DefaultList());		
		List uniqueAndNotNullable = NotNullableList.decorate(uniqueItemList);		
		uniqueAndNotNullable.add("Hi");
		uniqueAndNotNullable.add("Hi");
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void unmodifableList() {
		List uniqueItemList = UniqueItemList.decorate(new DefaultList());		
		List uniqueAndNotNullable = NotNullableList.decorate(uniqueItemList);		
		uniqueAndNotNullable.add("Hi");
		uniqueAndNotNullable.add("Hello");

		List unmodifableList = UnmodifableList.decorate(uniqueAndNotNullable);
		unmodifableList.add("un suport");
	}
}
