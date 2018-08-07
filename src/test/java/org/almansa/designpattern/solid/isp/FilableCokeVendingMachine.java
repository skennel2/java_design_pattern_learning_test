package org.almansa.designpattern.solid.isp;

public class FilableCokeVendingMachine implements CokeVendingMachine, CokeFilable {

	private long remainingCoin;

	private long remainingCoke;

	private final long maxCapacity;

	private final long priceOfCoke;

	public FilableCokeVendingMachine(long remainingCoke, long maxCapacity, long priceOfCoke) {
		super();
		this.remainingCoin = 0;
		this.remainingCoke = remainingCoke;
		this.maxCapacity = maxCapacity;
		this.priceOfCoke = priceOfCoke;
	}

	@Override
	public long getRemaingCoin() {
		return remainingCoin;
	}

	@Override
	public void acceptCoin(long amountOfCoin) {
		if(amountOfCoin < 0) {
			throw new IllegalArgumentException();
		}
		
		remainingCoin = remainingCoin + amountOfCoin;
	}

	@Override
	public Coke dispenseCoke() {
		if(remainingCoin < priceOfCoke) {
			throw new IllegalStateException("잔돈이 부족합니다.");
		}
		
		if(remainingCoke <= 0) {
			throw new IllegalStateException("재고가 부족합니다.");
		}
		
		remainingCoin = remainingCoin - priceOfCoke;
		remainingCoke--;
		
		return new Coke("Pepsi");
	}

	@Override
	public long getMaxCapacity() {
		return maxCapacity;
	}

	@Override
	public void fillCoke(long amount) {
		if(amount + remainingCoke > maxCapacity) {
			throw new IllegalStateException("수용량 초과");
		}
		
		remainingCoke = remainingCoke + amount;
	}

	@Override
	public long giveChange() {
		long change = remainingCoin;
		
		remainingCoin = 0;
		
		return change;
	}

	@Override
	public long getRemainingCapacity() {		
		return remainingCoke;
	}

}