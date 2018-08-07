package org.almansa.designpattern.solid.isp;

public interface CokeVendingMachine {
	long getRemaingCoin();

	long giveChange();
	
	void acceptCoin(long amountOfCoin);

	Coke dispenseCoke();
}