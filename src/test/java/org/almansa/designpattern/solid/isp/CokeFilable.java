package org.almansa.designpattern.solid.isp;

public interface CokeFilable {
	long getMaxCapacity();

	long getRemainingCapacity();
	
	void fillCoke(long amount);
}