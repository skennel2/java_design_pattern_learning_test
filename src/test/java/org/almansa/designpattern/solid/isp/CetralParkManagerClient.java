package org.almansa.designpattern.solid.isp;

public class CetralParkManagerClient {
	private CokeFilable cokeVendingMachine;

	public CetralParkManagerClient(CokeFilable cokeVendingMachine) {
		super();
		this.cokeVendingMachine = cokeVendingMachine;
	}

	public void fillCoke(long amountOfCoke) {
		cokeVendingMachine.fillCoke(amountOfCoke);
	}
}