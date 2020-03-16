package com.dev21.pd4.factorymethod2;

public class OracleConnection extends Connection {

	protected OracleConnection() {
		super("oracle");
	}

	@Override
	void showObject() {
		System.out.println("objeto oracle");

	}

}
