package org.almansa.designpattern.solid.isp;

public class CokeAndChange {
	private Coke coke;
	private long change;

	public CokeAndChange() {
		super();
	}

	public CokeAndChange(Coke coke, long change) {
		super();
		this.coke = coke;
		this.change = change;
	}

	public Coke getCoke() {
		return coke;
	}

	public void setCoke(Coke coke) {
		this.coke = coke;
	}

	public long getChange() {
		return change;
	}

	public void setChange(long change) {
		this.change = change;
	}

}
