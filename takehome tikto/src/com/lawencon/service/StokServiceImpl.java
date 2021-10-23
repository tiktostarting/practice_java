package com.lawencon.service;

import java.util.ArrayList;
import java.util.List;
import com.lawencon.model.Barang;

public class StokServiceImpl implements StokService {
	
	protected List<Barang> item = new ArrayList<Barang>();
	
	public void tambah(Barang tambahan) {
		item.add(tambahan);
	}
	
	public void ubah(Integer index, Barang pembaharuan) {
		Barang terkini = new Barang();
		terkini.setHarga(pembaharuan.getHarga());
		terkini.setItem(pembaharuan.getItem());
		terkini.setJenis(pembaharuan.getJenis());
		terkini.setStok(pembaharuan.getStok());
		item.set(index - 1, terkini);
	}
	
	public void hapus(Integer index) {
		item.remove(index - 1);
	}
}
