package com.dev21.pd7.decorator;

public class DecoratorPatternExample {

	public static void main(String[] args) {
		System.out.println("***Decorator pattern Demo***\n");
		Component withoutDecorator = new ConcreteComponent();
		withoutDecorator.makeHouse();
		System.out.println("_________________");

		// Using a decorator to add floor
		System.out.println("Using a Floor decorator now.");

		FloorDecorator floorDecorator = new FloorDecorator();
		floorDecorator.setTheComponent(withoutDecorator);
		floorDecorator.makeHouse();
		System.out.println("_________________");

		// Using a decorator to add floor to original house and then
		// paint it.
		System.out.println("Using a Paint decorator now.");
		PaintDecorator paintDecorator = new PaintDecorator();
		// Adding results from floor decorator
		paintDecorator.setTheComponent(floorDecorator);
		paintDecorator.makeHouse();
		System.out.println("_________________");
	}

}
