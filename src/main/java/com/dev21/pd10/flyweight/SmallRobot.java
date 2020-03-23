package com.dev21.pd10.flyweight;

public class SmallRobot implements Robot {

	private final String robotTypeCreated;

	public SmallRobot() {
		robotTypeCreated = "A small robot created";
		System.out.println(robotTypeCreated);
	}


	@Override
	public void showMe(String color) {
		System.out.println(" with " + color + " color");
	}

}
