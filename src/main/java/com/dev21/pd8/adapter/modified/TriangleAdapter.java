package com.dev21.pd8.adapter.modified;

public class TriangleAdapter implements RectInterface {

	Triangle triangle;

	public TriangleAdapter(Triangle t) {
		this.triangle = t;
	}

	@Override
	public void aboutRectangle() {
		triangle.aboutMe();
	}

	@Override
	public double calculateAreaOfRectangle() {
		return triangle.calculateAreaOfTriangle();
	}

}
