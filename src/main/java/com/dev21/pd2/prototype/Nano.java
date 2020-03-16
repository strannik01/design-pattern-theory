package com.dev21.pd2.prototype;

public class Nano extends BasicCar {
	
	public int basePrice=100000;
	
	public Nano(String modelName) {
		super.modelName = modelName;
	}
	
	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
