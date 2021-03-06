package com.lawencon.spring.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_layanan")
public class Layanan extends BaseModel{

	@Column(name = "nama_layanan", length = 30)
	private String namaLayanan;
	
	@Column(name = "kd_layanan", unique = true, length = 10)
	private String KodeLayanan;
	
	@Column(name = "harga")
	private BigDecimal harga;

	public String getNamaLayanan() {
		return namaLayanan;
	}

	public void setNamaLayanan(String namaLayanan) {
		this.namaLayanan = namaLayanan;
	}

	public String getKodeLayanan() {
		return KodeLayanan;
	}

	public void setKodeLayanan(String kodeLayanan) {
		KodeLayanan = kodeLayanan;
	}

	public BigDecimal getHarga() {
		return harga;
	}

	public void setHarga(BigDecimal harga) {
		this.harga = harga;
	}

}
