package com.dev21.pd6.proxy;

public class ConcreteSubject extends Subject {

	@Override
	public void doSomeWork() {
		System.out.println("doSomeWork() inside ConcreteSubject is invoked.");
	}

}
