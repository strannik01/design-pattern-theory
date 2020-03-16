package com.dev21.pd4.factorymethod;

public class DogFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
