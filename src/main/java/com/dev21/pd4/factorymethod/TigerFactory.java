package com.dev21.pd4.factorymethod;

public class TigerFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Tiger();
	}

}
