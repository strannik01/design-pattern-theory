package com.dev21.pd6.proxy;

public class Proxy extends Subject {

	static Subject cs;
	
	@Override
	public void doSomeWork() {
		System.out.println("Proxy call happening now...");
		if (cs == null) {
			cs = new ConcreteSubject();
		}
		cs.doSomeWork();
	}

}
