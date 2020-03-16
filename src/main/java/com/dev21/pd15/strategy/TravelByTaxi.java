package com.dev21.pd15.strategy;

public class TravelByTaxi implements TravelToRailwayStation {

	@Override
	public void gotoRailwayStation() {
		System.out.println("Karan is Traveling to the Railway Station by a Taxi and will be charged 450 Rs");
	}

}
