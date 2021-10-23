package com.lawencon.service;

import com.lawencon.model.Item;
import java.util.List;

public interface BarangService {
	public void tambah(Integer qty, String namaItem, String tipe);
	public void ubah(Integer qty,String namaItem, Integer index);
	public void hapus(Integer index);
}
