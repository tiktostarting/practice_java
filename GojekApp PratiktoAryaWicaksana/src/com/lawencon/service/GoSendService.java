package com.lawencon.service;

public interface GoSendService extends GoService{

	Integer defaultPrice = 7000;
	
	Integer calculatePrice(String source, String dest, String receiver, Integer weight, Integer qty, String type);
	Integer analysisItem(Integer weight, Integer qty);
}
