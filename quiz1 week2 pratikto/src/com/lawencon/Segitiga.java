package com.lawencon;

import java.lang.Math;

public class Segitiga extends IsianBangunDatar{
	
	protected Float alas;
	protected Float tinggi;
	
	Segitiga(Float alas, Float tinggi){
		this.alas = alas;
		this.tinggi = tinggi;
	}

	@Override
	protected Float luas() {
		Float perhitungan = this.alas * this.tinggi / 2;
		return perhitungan;
	}
	
	@Override
	protected Float keliling() {
		Float alas = this.alas / 2;
		Float perhitungan = (float) Math.sqrt((alas*alas) + (tinggi*tinggi)) ; 
		perhitungan = perhitungan*2 + alas*2;
		return perhitungan;
	}
}
// (a^2 + b^2)