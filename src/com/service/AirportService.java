package com.service;

import java.util.List;

import com.pojo.Airport;

public interface AirportService {

	List<Airport> showTakePort();
	List<Airport> showLandPort();
}
