package com.lawencon.model;

public class Barang {
	private String jenis;
	private String item;
	private Integer stok;
	private Integer harga;
	
	public void setJenis(String jenis) {
		this.jenis = jenis;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public void setStok(Integer stok) {
		this.stok = stok;
	}
	
	public void setHarga(Integer harga) {
		this.harga = harga;
	}
	
	public Integer getHarga() {
		return this.harga;
	}
	
	public Integer getStok() {
		return this.stok;
	}
	
	public String getJenis() {
		return this.jenis;
	}
	
	public String getItem() {
		return this.item;
	}
	
}
