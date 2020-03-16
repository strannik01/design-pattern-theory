package com.dev21.pd4.factorymethod2;

public class SQLConnection extends Connection {
	
	protected SQLConnection() {
		super("sql");
	}

	@Override
	void showObject() {
		System.out.println("TRANSACTION");
		System.out.println("USERS");
		System.out.println("INVOICE");
		System.out.println("BORRADOR");
	}

}
