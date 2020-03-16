package com.dev21.pd.simplefactory;

public class SimpleFactory implements ISimpleFactory {

	public Animal createAnimal(int choice) {
		switch (choice) {
		case 0:
			return new Dog();
		case 1: 
			return new Tiger();
		default:
			throw new IllegalArgumentException(" Your choice tries to create an unknown Animal");
		}
	}
}
