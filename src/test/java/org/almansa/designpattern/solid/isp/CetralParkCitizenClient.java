package org.almansa.designpattern.solid.isp;

public class CetralParkCitizenClient {
	private CokeVendingMachine cokeVendingMachine;

	public CetralParkCitizenClient(CokeVendingMachine cokeVendingMachine) {
		super();
		this.cokeVendingMachine = cokeVendingMachine;
	}

	public CokeAndChangeDTO getCoke(long amountOfCoin) {
		cokeVendingMachine.acceptCoin(amountOfCoin);
		
		Coke coke = cokeVendingMachine.dispenseCoke();
		long change = cokeVendingMachine.giveChange();

		return new CokeAndChangeDTO(coke, change);
	}
}
