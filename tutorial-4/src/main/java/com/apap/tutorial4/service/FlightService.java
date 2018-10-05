package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

public interface FlightService {
	void addFlight (FlightModel flight);
	
	FlightModel getFlightByFlightNumber(String flightNumber);
	
	void deleteFlight (FlightModel flight);
}
