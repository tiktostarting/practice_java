package com.lawencon;

public enum DaftarBuku {
	JAVA(1,"Java", 10000),
	KOTLIN(2,"Kotlin", 11000),
	SPRING(3,"Spring", 12000),
	ANGULAR(4,"Angular", 13000);
	
	public String jenis;
	public int harga, index;
	
	DaftarBuku(int index, String jenis, int harga){
		this.index = index;
		this.jenis = jenis;
		this.harga = harga;
	}
	
	public int index() {
		return this.index;
	}

	public String getJenis() {
		return this.jenis;
	}
	
	public int harga() {
		return this.harga;
	}
}
