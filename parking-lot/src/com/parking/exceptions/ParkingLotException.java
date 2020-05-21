package com.parking.exceptions;

public class ParkingLotException extends RuntimeException {

	private static final long serialVersionUID = 8330589304432557691L;

	public ParkingLotException(String message) {
		super(message);
	}
}
