package com.dev21.pd.adapter.modified;

public class TriangleClassAdapter extends Triangle implements RectInterface {

	public TriangleClassAdapter(double base, double height) {
		super(base, height);
	}

	@Override
	public void aboutRectangle() {
		aboutMe();
	}

	@Override
	public double calculateAreaOfRectangle() {
		return calculateAreaOfTriangle();
	}
	
}
