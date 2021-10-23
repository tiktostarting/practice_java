package com.lawencon.service;

public interface GoRideService extends GoService{
	
	Integer defaultPrice = 100;
	
	Integer calculatePrice(String source, String dest);
}
