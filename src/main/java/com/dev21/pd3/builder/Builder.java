package com.dev21.pd3.builder;

public interface Builder {

	void startUpOperations();
	void buildBody();
	void insertWheels();
	void addHeadlights();
	void endOperations();
	Product getVehicle();
}
