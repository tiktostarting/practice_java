package com.lawencon.spring.dto.role;

public class UpdateDataResData {
	
	private String namaRole;
	private String kodeRole;
	private Integer version;
	private Long id;
	
	public String getNamaRole() {
		return namaRole;
	}
	public void setNamaRole(String namaRole) {
		this.namaRole = namaRole;
	}
	public String getKodeRole() {
		return kodeRole;
	}
	public void setKodeRole(String kodeRole) {
		this.kodeRole = kodeRole;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
