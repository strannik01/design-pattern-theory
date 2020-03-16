package com.dev21.pd4.factorymethod2;

public abstract class Connection {
	
	protected Connection(String typeDataBase) {
		System.out.println("Connectando a base de datos " + typeDataBase);
	}
	
	abstract void showObject();
	

}
