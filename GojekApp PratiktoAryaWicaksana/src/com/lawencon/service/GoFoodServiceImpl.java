package com.lawencon.service;

import com.lawencon.model.Drivers;
import com.lawencon.model.Konsumsi;

public class GoFoodServiceImpl implements GoFoodService{
	
	@Override
	public Integer calculatePrice(Konsumsi makanan,String destination) {
		// TODO Auto-generated method stub
		Integer jumlahMakanan = makanan.getJumlahMakanan();
		String namaMakanan = makanan.getNamaMakanan();
		String namaRestoran = makanan.getNamaRestoran();		
		Integer perhitungan = ((jumlahMakanan * namaMakanan.length() * destination.length() ) - namaRestoran.length()) * defaultPrice;		
		return perhitungan;
	}

	@Override
	public Drivers getDriver() {
		Drivers driver = new Drivers();
		driver.setNama("Ryan");
		driver.setPlatNo("B 7655 BCE");
		driver.setNoHp("08932392322934");
		return driver;
	}
	
}
