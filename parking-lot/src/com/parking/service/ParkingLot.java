package com.parking.service;

import java.util.HashMap;
import java.util.Map;

import com.parking.entity.Car;

public abstract class ParkingLot {
	public int size = 10;
	public static Map<Integer, Car> listOfParkedVehicle = new HashMap<>();

	public abstract Car addVehicle();

	public static Map<Integer, Car> getListOfParkedVehicle() {
		return listOfParkedVehicle;
	}

}
