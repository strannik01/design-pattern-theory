package com.dev21.pd5.abstractfactory;

public class PetAnimalFactory implements AnimalFactory {

	@Override
	public Dog createDog() {
		return new PetDog();
	}

	@Override
	public Tiger createTiger() {
		return new PetTiger();
	}

}
