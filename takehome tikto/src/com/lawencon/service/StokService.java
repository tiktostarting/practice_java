package com.lawencon.service;

import com.lawencon.model.Barang;

public interface StokService {
	public void tambah(Barang tambahan);
	public void ubah(Integer index, Barang pembaharuan);
	public void hapus(Integer index);
}
