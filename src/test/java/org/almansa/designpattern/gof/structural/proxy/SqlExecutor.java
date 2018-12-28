package org.almansa.designpattern.gof.structural.proxy;

public interface SqlExecutor {
	void query(String sqlStatement);

	Object queryForResult(String sqlStatement);
}
