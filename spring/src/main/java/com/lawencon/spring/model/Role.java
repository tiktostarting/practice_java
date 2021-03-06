package com.lawencon.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_role")
public class Role extends BaseModel{
	
	@Column(name = "kd_role", unique = true, length = 10) 
	private String kodeRole;
	
	@Column(name = "nama_role", length = 20)
	private String namaRole;

	public String getKodeRole() {
		return kodeRole;
	}

	public void setKodeRole(String kodeRole) {
		this.kodeRole = kodeRole;
	}

	public String getNamaRole() {
		return namaRole;
	}

	public void setNamaRole(String namaRole) {
		this.namaRole = namaRole;
	}
	
}
