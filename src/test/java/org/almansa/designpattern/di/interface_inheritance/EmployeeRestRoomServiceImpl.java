package org.almansa.designpattern.di.interface_inheritance;

public class EmployeeRestRoomServiceImpl implements EmployeeRestRoomService{

	private CoffeeMachine coffeeMachine;
	
	public EmployeeRestRoomServiceImpl(CoffeeMachine coffeeMachine) {
		super();
		this.coffeeMachine = coffeeMachine;
	}

	@Override
	public Coffee getCoffee(String coffeeName) {
		return coffeeMachine.makeCoffee(coffeeName);
	}

	@Override
	public void enjoySmallTalk() {
		System.out.println("we love C#");
	}
	
}