package com.lawencon.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_karyawan")
public class Karyawan extends BaseModel{
	
	@Column(name = "username", length = 25)
	private String username;
	
	@Column(name = "pass", length = 100)
	private String pass;
	
	@ManyToOne
	@JoinColumn(name = "id_role")
	private Role idRole;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Role getIdRole() {
		return idRole;
	}

	public void setIdRole(Role idRole) {
		this.idRole = idRole;
	}
	
	
}
