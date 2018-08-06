package org.almansa.designpattern.di.interface_inheritance;

public class fillableCoffeeMachineImpl implements fillableCoffeeMachine{

	private CoffeeMachine coffeeMachine;
	
	public fillableCoffeeMachineImpl(CoffeeMachine coffeeMachine) {
		super();
		this.coffeeMachine = coffeeMachine;
	}

	@Override
	public void showMenu() {
		coffeeMachine.showMenu();
	}

	@Override
	public boolean isAbleToMake(String coffeeName) {
		return coffeeMachine.isAbleToMake(coffeeName);
	}

	@Override
	public Coffee makeCoffee(String coffeeName) {
		return coffeeMachine.makeCoffee(coffeeName);
	}

	@Override
	public void fillCoffeeBean(long amountOfCoffeeBean) {
		System.out.println("coffee bean filled");
	}
	
}