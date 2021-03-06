package com.lawencon.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_kategori")
public class Kategori extends BaseModel{
	
	@Column(name = "nama_ktgr", length = 30)
	private String namaKategori;
	
	@Column(name = "kd_ktgr", unique = true,length = 10)
	private String kodeKategori;

	public String getNamaKategori() {
		return namaKategori;
	}

	public void setNamaKategori(String namaKategori) {
		this.namaKategori = namaKategori;
	}

	public String getKodeKategori() {
		return kodeKategori;
	}

	public void setKodeKategori(String kodeKategori) {
		this.kodeKategori = kodeKategori;
	}
	
}
