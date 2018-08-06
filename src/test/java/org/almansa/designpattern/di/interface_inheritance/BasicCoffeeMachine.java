package org.almansa.designpattern.di.interface_inheritance;

import java.util.Map;

public class BasicCoffeeMachine implements CoffeeMachine{

	private Map<String, Coffee> coffees;

	public void setCoffees(Map<String, Coffee> coffees) {
		this.coffees = coffees;
	}

	@Override
	public void showMenu() {
		coffees.forEach((name, Coffee) -> {
			System.out.println(name);
		});
	}
	
	@Override
	public Coffee makeCoffee(String coffeeName) {
		if(isAbleToMake(coffeeName)) {
			return coffees.get(coffeeName);
		}
		
		return null;
	}

	@Override
	public boolean isAbleToMake(String coffeeName) {
		return coffees.containsKey(coffeeName);
	}	
}