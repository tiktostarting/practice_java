package com.lawencon.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "tb_m_office_hdr")
public class OfficeHdr extends BaseModel{
	
	@Column(name = "kd_office", length = 15, unique = true)
	private String kodeOffice;
	
	@Column(name = "kota", length = 45)
	private String kota;
	
	@Column(name = "no_telp", length = 15)
	private String noTelp;
	
	public String getKodeOffice() {
		return kodeOffice;
	}
	public void setKodeOffice(String kodeOffice) {
		this.kodeOffice = kodeOffice;
	}
	public String getKota() {
		return kota;
	}
	public void setKota(String kota) {
		this.kota = kota;
	}
	public String getNoTelp() {
		return noTelp;
	}
	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}
	
}
