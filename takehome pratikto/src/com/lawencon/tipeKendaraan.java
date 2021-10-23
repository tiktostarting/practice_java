package com.lawencon;

public enum tipeKendaraan {

	MOBIL(1,"mobil", 5000), MOTOR(2,"motor", 1000);
	
	public int indexKendaraan;
	public String namaKendaraan;
	public int biayaParkir;
	
	tipeKendaraan(int indexKendaraan, String namaKendaraan, int biayaParkir){
		this.indexKendaraan = indexKendaraan;
		this.namaKendaraan = namaKendaraan;
		this.biayaParkir = biayaParkir;
	}
	
	public int getIndexKendaraan(){
		return this.indexKendaraan;
	}
	
	public String getNamaKendaraan() {
		return this.namaKendaraan;
	}
	
	public int getBiayaParkir() {
		return this.biayaParkir;
	}
}
