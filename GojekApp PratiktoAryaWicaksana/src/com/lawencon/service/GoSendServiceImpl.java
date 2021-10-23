package com.lawencon.service;

import com.lawencon.model.Drivers;

public class GoSendServiceImpl implements GoSendService {

	@Override
	public Integer calculatePrice(String source, String dest, String receiver, Integer weight, Integer qty,
			String type) {
		return defaultPrice * (type.length() + (weight * qty) / receiver.length());
	}

	@Override
	public Drivers getDriver() {
		Drivers driver = new Drivers();
		driver.setNama("Mr. Bean");
		driver.setNoHp("77718281728");
		driver.setPlatNo("B0000YAH");
		return driver;
	}

	@Override
	public Integer analysisItem(Integer weight, Integer qty) {
		return null;
	}
}
