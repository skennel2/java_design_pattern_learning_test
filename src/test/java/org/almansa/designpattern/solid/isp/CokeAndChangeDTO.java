package org.almansa.designpattern.solid.isp;

public class CokeAndChangeDTO {
	private Coke coke;
	private long change;

	public CokeAndChangeDTO() {
		super();
	}

	public CokeAndChangeDTO(Coke coke, long change) {
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
