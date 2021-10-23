package com.lawencon.service;

import com.lawencon.model.Drivers;

public class GoRideServiceImpl implements GoRideService{
	
	@Override
	public Integer calculatePrice(String source, String dest) {
		return defaultPrice * (source.length() + dest.length());
	}
	
	@Override
	public Drivers getDriver() {
		Drivers driver = new Drivers();
		driver.setNama("Juki");
		driver.setPlatNo("B12345788");
		driver.setNoHp("08932392322934");
		return driver;
	}
}
