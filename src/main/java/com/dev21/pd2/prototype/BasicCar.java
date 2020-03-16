package com.dev21.pd2.prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
	
	protected String modelName;
	protected int basePrice;
	protected int onRoadPrice;
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public static int setAdditionalPrice() {
		int price = 0;
		Random random = new Random();
		int p = random.nextInt(100000);
		price = p;
		return price;
	}
	
	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		return (BasicCar) super.clone();
	}

}
