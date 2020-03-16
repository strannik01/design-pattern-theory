package com.dev21.pd15.strategy;

public class TravelByBus implements TravelToRailwayStation {

	@Override
	public void gotoRailwayStation() {
		System.out.println("Karan is Traveling to the Railway Station by a Bus and will be charged 120 Rs");
	}

}
