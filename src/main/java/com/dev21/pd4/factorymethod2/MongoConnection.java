package com.dev21.pd4.factorymethod2;

public class MongoConnection extends Connection {
	
	protected MongoConnection() {
		super("mongo");
	}

	@Override
	public void showObject() {
		System.out.println("TRANSACTION");
		System.out.println("USERS");
		System.out.println("INVOICE");
		System.out.println("BORRADOR");
	}
	
	

}
