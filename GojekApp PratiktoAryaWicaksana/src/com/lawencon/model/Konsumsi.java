package com.lawencon.model;

public class Konsumsi {
	private String namaMakanan;
	private String namaRestoran;
	private Integer hargaMakanan;
	private Integer jumlahMakanan;
	
	public void setJumlahMakanan(Integer jumlahMakanan) {
		this.jumlahMakanan = jumlahMakanan;
	}
	
	public void setNamaRestoran(String namaRestoran) {
		this.namaRestoran = namaRestoran;
	}
	
	public void setNamaMakanan(String namaMakanan) {
		this.namaMakanan = namaMakanan;
	}
	
	public void sethargaMakanan(Integer hargaMakanan) {
		this.hargaMakanan = hargaMakanan;
	}	
	
	public Integer gethargaMakanan() {
		return this.hargaMakanan;
	}
	
	public Integer getJumlahMakanan() {
		return this.jumlahMakanan;
	}
	
	public String getNamaRestoran() {
		return this.namaRestoran;
	}
	
	public String getNamaMakanan() {
		return this.namaMakanan;
	}
}
