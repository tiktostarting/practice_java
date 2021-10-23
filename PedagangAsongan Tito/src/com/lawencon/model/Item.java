package com.lawencon.model;

public class Item {
	private String namaItem;
	private Integer jumlahItem;
	private Integer hargaItem;
	
	public String getNamaItem() {
		return this.namaItem;
	}
	
	public Integer getJumlahItem() {
		return this.jumlahItem;
	}
	
	public Integer getHargaItem() {
		return this.hargaItem;
	}
	
	public void setNamaItem(String namaItem) {
		this.namaItem = namaItem;
	}
	
	public void setJumlahItem(Integer jumlahItem) {
		this.jumlahItem = jumlahItem;
	}
	public void setHargaItem(Integer hargaItem) {
		this.hargaItem = hargaItem;
	}
}
