package com.dev21.pd15.strategy;

public class Travel {
	private TravelToRailwayStation travelToRailwayStation;

	public void setTravelToRailwayStation(TravelToRailwayStation railwayStation) {
		this.travelToRailwayStation = railwayStation;
	}

	public TravelToRailwayStation getTravelToRailwayStation() {
		return travelToRailwayStation;
	}

	public void gotoRailwayStation() {
		travelToRailwayStation.gotoRailwayStation();
	}

}
