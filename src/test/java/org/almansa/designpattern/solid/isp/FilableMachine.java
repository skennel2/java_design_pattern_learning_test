package org.almansa.designpattern.solid.isp;

public interface FilableMachine {
	long getMaxCapacity();

	long getRemainingCapacity();

	void fillCoke(long amount);
}