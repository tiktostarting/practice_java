package com.lawencon.service;

public interface GoRideService extends GoService {
	
	Integer defaultPrice = 10000;

	Integer calculatePrice(String source, String dest);
	
}
