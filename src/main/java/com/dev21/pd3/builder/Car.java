package com.dev21.pd3.builder;

public class Car implements Builder {
	
	private String brandName;
	private Product product;
	
	public Car(String brand) {
		product = new Product();
		this.brandName = brand;
	}

	@Override
	public void startUpOperations() {
		product.add(String.format("Car model is :%s",this.brandName));
	}

	@Override
	public void buildBody() {
		product.add("This is a body of a Car");
	}

	@Override
	public void insertWheels() {
		product.add("4 wheels are added");
	}

	@Override
	public void addHeadlights() {
		product.add("2 Headlights are added");
	}

	@Override
	public void endOperations() {
		// TODO Auto-generated method stub
		
	}
	
	public Product getVehicle() {
		return product;
	}

}
