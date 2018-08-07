package org.almansa.designpattern.solid.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestClient {
	@Test
	public void cetralParkClientTest() {
		CokeVendingMachine cokeVendingMachine = new FilableCokeVendingMachine(10, 30, 1000);
		
		CetralParkCitizenClient centralPark = new CetralParkCitizenClient(cokeVendingMachine);
		CokeAndChangeDTO cokeAndChange = centralPark.getCoke(1200);
		
		assertEquals(200, cokeAndChange.getChange());
	}
	
	@Test
	public void cetralParkManagerClient() {
		CokeFilable cokeFilable = new FilableCokeVendingMachine(10, 30, 1000);
		
		CetralParkManagerClient centralPark = new CetralParkManagerClient(cokeFilable);
		centralPark.fillCoke(5);
		
		assertEquals(15, cokeFilable.getRemainingCapacity());
		
	}	
	
	@Test(expected = IllegalStateException.class)
	public void cetralParkManagerClientOverTheCapacity() {
		CokeFilable cokeFilable = new FilableCokeVendingMachine(10, 30, 1000);
		
		CetralParkManagerClient centralPark = new CetralParkManagerClient(cokeFilable);
		centralPark.fillCoke(200);
		
	}		
}
