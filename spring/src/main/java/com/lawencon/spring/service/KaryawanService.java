package com.lawencon.spring.service;

import com.lawencon.spring.model.Karyawan;

public interface KaryawanService {
	void insert(Karyawan data);
	void update(Karyawan data);
	void delete(Long id);
	Karyawan getByName(String name);
	Karyawan getById(Long id);
}
