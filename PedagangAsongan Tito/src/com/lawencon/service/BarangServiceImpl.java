package com.lawencon.service;

import com.lawencon.model.Item;
import com.lawencon.constant.*;
import java.util.List;

public class BarangServiceImpl implements BarangService{
	
	private List<Item> items;
	
	public void inisialisasiList(List<Item> items){
		this.items = items;
	}
	
	public List<Item> getImplementasi(){
		return this.items;
	}
	
	public void tambah(Integer qty, String namaItem, String tipe) {
		Item terbaru = new Item();
		terbaru.setJumlahItem(qty);
		terbaru.setNamaItem(namaItem);
		items.add(terbaru);
	}
	
	public void ubah(Integer qty,String namaItem, Integer index) {
		Item terkini = new Item();
		terkini.setNamaItem(namaItem);
		terkini.setJumlahItem(qty);
		terkini.setHargaItem(namaItem.length());
		items.set(index - 1, terkini);
	}
	
	public void hapus(Integer index) {
		items.remove(index - 1);
	}
	
	public List<Item> getItems(){
		return this.items;
	}
}
