package com.dev21.pd5.abstractfactory;

public class WildAnimalFactory implements AnimalFactory {

	@Override
	public Dog createDog() {
		return new WildDog();
	}

	@Override
	public Tiger createTiger() {
		return new WildTiger();
	}

}
