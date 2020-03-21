package com.dev21.pd.decorator;

public class FloorDecorator extends AbstractDecorator {

	@Override
	public void makeHouse() {
		super.makeHouse();
		System.out.println("***Floor decorator is in action***");
		addFloor();
	}

	private void addFloor() {
		System.out.println("I am making an additional floor on top of it.");
	}

}
