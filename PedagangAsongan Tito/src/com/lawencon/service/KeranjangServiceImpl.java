package com.lawencon.service;

import com.lawencon.model.Item;
import java.util.List;

public class KeranjangServiceImpl implements KeranjangService{
	
	private List<Item> items;
	
	public Integer kalkulasi(List<Item> items) {
		Item tambahHarga = new Item();
		Integer total = 0;
		Integer a = 0;
		Integer harga;
		String nama;
		Integer qty;
		for(Item i : items) {
			harga = (i.getNamaItem().length()) * 1000 ;
			qty = i.getJumlahItem();
			nama = i.getNamaItem();
			tambahHarga.setHargaItem(harga);
			tambahHarga.setJumlahItem(qty);;
			tambahHarga.setNamaItem(nama);
			items.set(a, tambahHarga);
			a++;
			total += (harga * qty);
		}
		
		this.items = items;
		return total;	
	}
	
	public List<Item> getItems(){
		return this.items;
	}
}
