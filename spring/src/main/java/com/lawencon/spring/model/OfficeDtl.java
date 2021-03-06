package com.lawencon.spring.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tb_m_office_dtl")
public class OfficeDtl extends BaseModel{

	@ManyToOne
	@JoinColumn(name = "id_office_hdr")
	private OfficeHdr idOfficeHdr;
	
	@ManyToOne
	@JoinColumn(name = "id_layanan")
	private Layanan idLayanan;

	public OfficeHdr getIdOfficeHdr() {
		return idOfficeHdr;
	}

	public void setIdOfficeHdr(OfficeHdr idOfficeHdr) {
		this.idOfficeHdr = idOfficeHdr;
	}

	public Layanan getIdLayanan() {
		return idLayanan;
	}

	public void setIdLayanan(Layanan idLayanan) {
		this.idLayanan = idLayanan;
	}
	
	
}
