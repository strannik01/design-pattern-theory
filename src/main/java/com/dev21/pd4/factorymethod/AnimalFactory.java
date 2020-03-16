package com.dev21.pd4.factorymethod;

public abstract class AnimalFactory {
	
	public Animal makeAnimal() {
		Animal animal = createAnimal();
		animal.speak();
		animal.preferredAction();
		return animal;
	}

	public abstract Animal createAnimal();
}
