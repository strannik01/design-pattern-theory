package com.dev21.pd2.prototype;

public class Ford extends BasicCar {

	public int basePrice = 100000;

	public Ford(String modelName) {
		super.modelName = modelName;
	}

	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
