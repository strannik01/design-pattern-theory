package com.dev21.pd4.factorymethod;

public class ModifiedFactoryMethodPatternExample {
	
	public static void main(String[] args) {
		AnimalFactory tigerFactory =new TigerFactory();
		Animal aTiger = tigerFactory.makeAnimal();
		
		AnimalFactory dogFactory = new DogFactory();
		Animal aDog = dogFactory.makeAnimal();
	}

}
