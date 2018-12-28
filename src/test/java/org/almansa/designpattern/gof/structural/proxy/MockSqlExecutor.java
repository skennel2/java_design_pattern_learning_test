package org.almansa.designpattern.gof.structural.proxy;

public class MockSqlExecutor implements SqlExecutor {

	@Override
	public void query(String sqlStatement) {
		System.out.println("execute : " + sqlStatement);
	}

	@Override
	public Object queryForResult(String sqlStatement) {
		System.out.println("execute : " + sqlStatement);
		return null;
	}
}