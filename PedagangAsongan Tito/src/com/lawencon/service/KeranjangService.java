package com.lawencon.service;

import com.lawencon.model.Item;
import java.util.List;

public interface KeranjangService {
	
	Integer defaultHarga = 1000;
	
	Integer kalkulasi(List<Item> items);
}
