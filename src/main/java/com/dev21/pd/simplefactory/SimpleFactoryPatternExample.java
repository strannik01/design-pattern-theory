package com.dev21.pd.simplefactory;

public class SimpleFactoryPatternExample {
	private static final int DOG = 0;
	private static final int TIGER = 1;
	
	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		Animal animal1 = factory.createAnimal(DOG);
		animal1.speak();
		animal1.preferredAction();
		
		Animal animal2 = factory.createAnimal(TIGER);
		animal2.speak();
		animal2.preferredAction();
	}

}
