package com.lawencon.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "tb_m_pelanggan")
public class Pelanggan extends BaseModel{
	
	@Column(name = "nama_plgn", unique = true, length = 30)
	private String namaPelanggan;

	@Column(name = "alamat", length = 30)
	private String alamat;
	
	@Column(name = "no_telp", length = 12)
	private String noTelp;

	public String getNamaPelanggan() {
		return namaPelanggan;
	}

	public void setNamaPelanggan(String namaPelanggan) {
		this.namaPelanggan = namaPelanggan;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoTelp() {
		return noTelp;
	}

	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}
	
}
