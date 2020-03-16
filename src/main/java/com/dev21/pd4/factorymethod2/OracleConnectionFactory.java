package com.dev21.pd4.factorymethod2;

public class OracleConnectionFactory implements ConnectionFactory {

	@Override
	public Connection getConnection() {
		return new OracleConnection();
	}

}
