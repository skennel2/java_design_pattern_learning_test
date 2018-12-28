package org.almansa.designpattern.gof.structural.proxy;

import org.junit.Test;

public class TestClient {

	@Test(expected = RuntimeException.class)
	public void queryTest() throws Exception {
		try (DataBaseManager dataBaseManager = new DataBaseManager()) {
			dataBaseManager.connect();
			SqlExecutor databaseManager = dataBaseManager.getSqlExecutor();

			databaseManager.query("UPDATE SET COL1 = ");
		}
	}
}
