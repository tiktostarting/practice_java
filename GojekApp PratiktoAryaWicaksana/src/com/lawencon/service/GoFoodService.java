package com.lawencon.service;

import com.lawencon.model.Konsumsi;

public interface GoFoodService extends GoService{
	Integer defaultPrice = 5000;
	
	Integer calculatePrice(Konsumsi makanan,String destination);
}
