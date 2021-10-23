package com.lawencon;

public class Lingkaran extends IsianBangunDatar{
	
	private Float jarijari;
	
	Lingkaran(Float jarijari){
		this.jarijari = jarijari;
	}
	
	@Override
	protected Float luas() {
		Float perhitungan = 22 / 7 * this.jarijari * this.jarijari;
		return perhitungan;
	}
	
	@Override
	protected Float keliling() {
		Float perhitungan = 22 / 7 * this.jarijari * 2;
		return perhitungan;
	}
}
