package com.dev21.pd.adapter;

public class CalculatorAdapter {
	
	public double getArea(Triangle triangle) {
		Calculator c = new Calculator();
		Rectangle rect = new Rectangle();
		//Area of Triangle=0.5*base*height
		rect.length = triangle.base;
		rect.width = 0.5 * triangle.height;
		return c.getArea(rect);
	}

}
