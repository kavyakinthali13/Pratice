package com.learn.busBooking.controller.exception;

public class BusNotFoundException extends RuntimeException {
	public BusNotFoundException() {
		super("Buses are not found ");
	}

}
