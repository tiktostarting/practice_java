package com.lawencon.spring.dao;

import com.lawencon.spring.model.Karyawan;

public interface KaryawanDao {
	public void insert(Karyawan data);
	public Karyawan getById(Long id);
	public Karyawan getByName(String name);
	public void update(Karyawan data);
	public void delete(Long id);
	
}
