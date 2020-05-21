package com.parking;

import com.parking.entity.Car;
import com.parking.service.ParkingLot;
import com.parking.service.impl.CarParking;

public class ParkingAttendent {

	public static void main(String[] args) {
		Car car1 = new Car("Maruti", "red", "123456");
		ParkingLot parkingLot = new CarParking(car1);
		parkingLot.addVehicle();
		System.out.println(parkingLot.listOfParkedVehicle);

	}

}
