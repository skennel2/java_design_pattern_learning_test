package org.almansa.designpattern.di.interface_inheritance;

public interface CoffeeMachine {
	void showMenu();

	boolean isAbleToMake(String coffeeName);

	Coffee makeCoffee(String coffeeName);

}