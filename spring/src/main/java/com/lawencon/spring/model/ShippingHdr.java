package com.lawencon.spring.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_shipping_hdr")
public class ShippingHdr extends BaseModel{
	
	@JoinColumn(name = "kd_shipping", unique = true)
	private String kodeShipping;
	
	@JoinColumn(name = "id_pengirim")
	@ManyToOne
	private Pelanggan idPengirim;
	
	@JoinColumn(name = "id_penerima")
	@ManyToOne
	private Pelanggan idPenerima;
	
	@JoinColumn(name = "id_karyawan")
	@ManyToOne
	private Karyawan idKaryawan;
	
	@JoinColumn(name = "id_office")
	@ManyToOne
	private OfficeHdr idOffice;
}
