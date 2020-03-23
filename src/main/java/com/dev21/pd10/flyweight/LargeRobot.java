package com.dev21.pd10.flyweight;

public class LargeRobot implements Robot {

	private final String robotTypeCreated;

	public LargeRobot() {
		robotTypeCreated = "A large robot created";
		System.out.println(robotTypeCreated);
	}

	@Override
	public void showMe(String color) {
		System.out.println(" with " + color + " color");
	}

}
