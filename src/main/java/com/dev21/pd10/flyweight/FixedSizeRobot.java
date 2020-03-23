package com.dev21.pd10.flyweight;

public class FixedSizeRobot implements Robot {

	private final String robotTypeCreated;

	public FixedSizeRobot() {
		robotTypeCreated="A robot with a fixed size created";
		System.out.print(robotTypeCreated);
	}

	@Override
	public void showMe(String color) {
		System.out.print(" with " + " blue (default) color");
	}

}
