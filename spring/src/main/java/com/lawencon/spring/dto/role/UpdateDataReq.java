package com.lawencon.spring.dto.role;

public class UpdateDataReq {
	
	private Long id;
	private String kodeRole;
	private String namaRole;
	private Integer version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
}
