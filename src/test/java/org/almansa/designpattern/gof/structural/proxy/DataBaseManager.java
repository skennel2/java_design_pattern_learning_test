package org.almansa.designpattern.gof.structural.proxy;

public class DataBaseManager implements AutoCloseable{
	
	public void connect() {
		
	}
	
	@Override
	public void close() throws Exception {

	}
	
	public SqlExecutor getSqlExecutor() {
		 return new OnlyQuerySqlExecutorProxy(getDefaultSqlExecutor());
	}
	
	private SqlExecutor getDefaultSqlExecutor() {
		return new MockSqlExecutor();
	}
}
