package com.dev21.pd.adapter.modified;

public class Rectangle implements RectInterface {

	public double length;
	public double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void aboutRectangle() {
		System.out.println("Rectangle object with length: "+ this.length +"unit and width :" +this.width+ " unit.");
	}

	@Override
	public double calculateAreaOfRectangle() {
		return length * width;
	}

}
