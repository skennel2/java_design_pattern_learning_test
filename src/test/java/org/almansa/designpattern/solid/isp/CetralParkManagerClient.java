package org.almansa.designpattern.solid.isp;

/***
 * CetralParkManagerClient는 자판기에 어떻게 동전을 넣고, 음료를 뽑을수 있는지에는 관심이 없다.
 * 
 * @author skennel
 *
 */
public class CetralParkManagerClient {
	private FilableMachine cokeVendingMachine;

	public CetralParkManagerClient(FilableMachine cokeVendingMachine) {
		super();
		this.cokeVendingMachine = cokeVendingMachine;
	}

	public void fillCoke(long amountOfCoke) {
		cokeVendingMachine.fillCoke(amountOfCoke);
	}
}