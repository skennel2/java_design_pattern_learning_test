package org.almansa.designpattern.solid.isp;

public interface VendingMachine<T> {
	long getRemaingCoin();

	long giveChange();
	
	void acceptCoin(long amountOfCoin);

	T dispense();
}