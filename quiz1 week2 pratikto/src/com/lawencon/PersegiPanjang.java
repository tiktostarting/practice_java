package com.lawencon;

public class PersegiPanjang extends IsianBangunDatar{
	
	protected Float panjang;
	protected Float lebar;
	
	PersegiPanjang(Float panjang, Float lebar){
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	@Override
	protected Float luas() {
		Float perhitungan = this.panjang * this.lebar;
		return perhitungan;
	}
	
	@Override
	protected Float keliling() {
		Float perhitungan = this.panjang * 2 + this.lebar * 2;
		return perhitungan;
	}
}
