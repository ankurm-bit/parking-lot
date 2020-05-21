package com.parking.service.impl;

import com.parking.entity.Car;
import com.parking.exceptions.ParkingLotException;
import com.parking.service.ParkingLot;

public class CarParking extends ParkingLot {
	private Car car;

	public CarParking(Car car) {
		this.car = car;
	}

	@Override
	public Car addVehicle() {

		if (listOfParkedVehicle.size() <= size) {
			listOfParkedVehicle.put(listOfParkedVehicle.size() + 1, car);
		} else
			throw new ParkingLotException("There is no space available in parking lot");

		return car;
	}

}
