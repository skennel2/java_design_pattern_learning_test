package org.almansa.designpattern.di.interface_inheritance;

public class RestRoomManagementServiceImpl implements RestRoomManagementService{

	private fillableCoffeeMachine fillableCoffeeMachine;
	
	@Override
	public void fillUpCoffeeBean(long amountOfCoffeeBean) {
		fillableCoffeeMachine.fillCoffeeBean(amountOfCoffeeBean);
	}
	
}