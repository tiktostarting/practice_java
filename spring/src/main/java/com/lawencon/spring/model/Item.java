package com.lawencon.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_t_item")
public class Item extends BaseModel{
	
	@Column(name = "beban_item")
	private Integer bebanItem;
	
	@Column(name = "nama_item")
	private String namaItem;
	
	@Column(name = "deskripsi_item")
	private String deskripsi;
	
	@JoinColumn(name = "id_kategori")
	@ManyToOne
	private Kategori idKategori;

	public Integer getBebanItem() {
		return bebanItem;
	}

	public void setBebanItem(Integer bebanItem) {
		this.bebanItem = bebanItem;
	}

	public String getNamaItem() {
		return namaItem;
	}

	public void setNamaItem(String namaItem) {
		this.namaItem = namaItem;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public Kategori getIdKategori() {
		return idKategori;
	}

	public void setIdKategori(Kategori idKategori) {
		this.idKategori = idKategori;
	}
	
}
