package org.almansa.designpattern.solid.isp;

/**
 * 
 * @author skennel
 *
 */
public class CetralParkCitizenClient {
	private VendingMachine<Coke> cokeVendingMachine;

	public CetralParkCitizenClient(VendingMachine<Coke> cokeVendingMachine) {
		super();
		this.cokeVendingMachine = cokeVendingMachine;
	}

	public CokeAndChange getCoke(long amountOfCoin) {
		cokeVendingMachine.acceptCoin(amountOfCoin);

		Coke coke = cokeVendingMachine.dispense();
		long change = cokeVendingMachine.giveChange();

		return new CokeAndChange(coke, change);
	}
}
