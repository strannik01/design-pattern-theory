package com.dev21.pd4.factorymethod2;

public class MongoConnectionFactory implements ConnectionFactory {

	@Override
	public Connection getConnection() {
		return new MongoConnection();
	}

}
