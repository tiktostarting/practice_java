package com.lawencon;

public class Persegi extends IsianBangunDatar {
	
	protected Float sisi;
	
	Persegi(Float sisi){
		this.sisi = sisi;
	}
	
	@Override
	Float luas() {
		Float perhitungan = this.sisi * this.sisi;
		return perhitungan;
	}
	
	@Override
	Float keliling() {
		Float perhitungan = this.sisi * 4;
		return perhitungan;
	}
}
