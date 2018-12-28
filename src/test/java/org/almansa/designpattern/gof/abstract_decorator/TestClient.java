package org.almansa.designpattern.gof.abstract_decorator;

import org.junit.Test;

public class TestClient {

	@Test(expected = IllegalArgumentException.class)
	public void notNullableList() {
		List notNullableList = new NotNullableList(new DefaultList());
		notNullableList.add(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void uniqueItemList() {
		List uniqueItemList = new UniqueItemList(new DefaultList());
		uniqueItemList.add("Hi");
		uniqueItemList.add("Hi");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void uniqueItemAndNotNullableList() {
		List uniqueItemList = new UniqueItemList(new DefaultList());		
		List uniqueAndNotNullable = new NotNullableList(uniqueItemList);		
		uniqueAndNotNullable.add(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void uniqueItemAndNotNullableList2() {
		List uniqueItemList = new UniqueItemList(new DefaultList());		
		List uniqueAndNotNullable = new NotNullableList(uniqueItemList);		
		uniqueAndNotNullable.add("Hi");
		uniqueAndNotNullable.add("Hi");
	}
}
