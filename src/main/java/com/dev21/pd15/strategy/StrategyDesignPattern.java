package com.dev21.pd15.strategy;

import java.util.Scanner;

public class StrategyDesignPattern {

	public static void main(String[] args) {
		System.out.println("Please enter mode of Transportation Type : 'Bus' or 'Taxi' or 'Auto' ");
		Scanner scanner = new Scanner(System.in);
		String transportationType = scanner.next();
		System.out.println("Transportation type is : " + transportationType);

		Travel travel = null;
		travel = new Travel();

		if ("Bus".equalsIgnoreCase(transportationType)) {
			travel.setTravelToRailwayStation(new TravelByBus());
		} else if ("Taxi".equalsIgnoreCase(transportationType)) {
			travel.setTravelToRailwayStation(new TravelByTaxi());
		} else if ("Auto".equalsIgnoreCase(transportationType)) {
			travel.setTravelToRailwayStation(new TravelByAuto());
		}
		System.out.println("Mode of Transportation has : " + travel.getTravelToRailwayStation());
		travel.gotoRailwayStation();

	}

}
