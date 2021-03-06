package com.lawencon.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "tb_m_status")
public class Status extends BaseModel{

	@Column(name = "nama_status", length = 20)
	private String namaStatus;
	
	@Column(name = "kd_status", unique = true, length = 10)
	private String kodeStatus;

	public String getNamaStatus() {
		return namaStatus;
	}

	public void setNamaStatus(String namaStatus) {
		this.namaStatus = namaStatus;
	}

	public String getKodeStatus() {
		return kodeStatus;
	}

	public void setKodeStatus(String kodeStatus) {
		this.kodeStatus = kodeStatus;
	}
	
}
