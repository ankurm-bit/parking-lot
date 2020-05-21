package com.parking.entity;

public class Car {
	private String name;
	private String color;
	private String registrationNumber;

	public Car(String name, String color, String registrationNumber) {
		this.name = name;
		this.color = color;
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", registrationNumber=" + registrationNumber + "]";
	}

}
