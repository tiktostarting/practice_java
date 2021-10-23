package com.lawencon.service;

import com.lawencon.model.Drivers;

public class GoRideServiceImpl implements GoRideService {

	@Override
	public Integer calculatePrice(String source, String dest) {
		return defaultPrice * (source.length() + dest.length());
	}

	@Override
	public Drivers getDriver() {
		Drivers driver = new Drivers();
		driver.setNama("John");
		driver.setPlatNo("B 123 XX");
		return driver;
	}

}
