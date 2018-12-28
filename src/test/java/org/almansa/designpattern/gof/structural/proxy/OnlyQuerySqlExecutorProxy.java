package org.almansa.designpattern.gof.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class OnlyQuerySqlExecutorProxy implements SqlExecutor {

	private SqlExecutor sqlExecutor;

	private List<String> rejectedKeywords;
	
	public OnlyQuerySqlExecutorProxy(SqlExecutor sqlExecutor) {
		this();
		this.sqlExecutor = sqlExecutor;
	}

	private OnlyQuerySqlExecutorProxy() {
		super();
		rejectedKeywords = new ArrayList<>();
		rejectedKeywords.add("UPDATE");
		rejectedKeywords.add("INSERT");
		rejectedKeywords.add("ALTER");
		rejectedKeywords.add("DELETE");
		rejectedKeywords.add("DROP");
	}

	@Override
	public void query(String sqlStatement) {
		if(rejectedKeywords.stream().anyMatch((keyword)-> sqlStatement.toUpperCase().startsWith(keyword) )) {
			throw new RuntimeException("not supported keyword");
		}
		
		sqlExecutor.query(sqlStatement);
	}

	@Override
	public Object queryForResult(String sqlStatement) {
		if(rejectedKeywords.stream().anyMatch((keyword)-> sqlStatement.toUpperCase().startsWith(keyword) )) {
			throw new RuntimeException("not supported keyword");
		}
		
		return sqlExecutor.queryForResult(sqlStatement);
	}
}
