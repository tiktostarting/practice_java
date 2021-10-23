package com.lawencon.constant;

public enum Restoran {

	RESTORANA("restoran A", "telur ceplok", 7000), 
	RESTORANB("restoran B", "lele goreng", 8000), 
	RESTORANC("restoran C", "ayam goreng", 9000), 
	RESTORAND("restoran D", "lontong sayur", 3000);
	
	public String makanan;
	public String namaRestoran;
	public Integer harga;
	
	Restoran(String namaRestoran, String makanan, Integer harga){
		this.makanan = makanan;
		this.namaRestoran = namaRestoran;
		this.harga = harga;
	}
	
	public String getNamaRestoran() {
		return this.namaRestoran;
	}
	
	public String getMakanan() {
		return this.makanan;
	}
	
	public Integer getHarga() {
		return this.harga;
	}
}
