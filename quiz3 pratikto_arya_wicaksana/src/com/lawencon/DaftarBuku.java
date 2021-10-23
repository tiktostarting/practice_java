package com.lawencon;

public enum DaftarBuku {
	
	JAVA("java", 10000, 1), KOTLIN("kotlin", 11000, 2), SPRING("spring", 12000, 3), ANGULAR("angular", 13000, 4);
	
	public String namaBuku;
	public int hargaBuku;
	public int indexBuku;
	
	DaftarBuku(String namaBuku, int hargaBuku, int indexBuku) {
		this.namaBuku = namaBuku;
		this.hargaBuku = hargaBuku;
		this.indexBuku = indexBuku;
	}
	
	public String getNamaBuku() {
		return this.namaBuku;
	}
	
	public int getHargaBuku() {
		return this.hargaBuku;
	}
	
	public int getIndexBuku() {
		return this.hargaBuku;
	}	
}
