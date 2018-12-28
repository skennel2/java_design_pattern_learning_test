package org.almansa.designpattern.gof.abstract_decorator;

import org.junit.Test;

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
	public void uniqueItemAndNotNullableList() {
		List uniqueItemList = UniqueItemList.decorate(new DefaultList());		
		List uniqueAndNotNullable = NotNullableList.decorate(uniqueItemList);		
		uniqueAndNotNullable.add(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void uniqueItemAndNotNullableList2() {
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
