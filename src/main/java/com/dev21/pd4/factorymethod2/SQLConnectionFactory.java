package com.dev21.pd4.factorymethod2;

public class SQLConnectionFactory implements ConnectionFactory {

	@Override
	public Connection getConnection() {
		return new SQLConnection();
	}

}
