package com.lawencon.spring.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.lawencon.spring.dao.KaryawanDao;
import com.lawencon.spring.model.Karyawan;

@Service
public class KaryawanServiceImpl implements KaryawanService{
	
	private KaryawanDao karyawanDao;
	
	@Autowired
	public void setKaryawanDao(KaryawanDao karyawanDao) {
		this.karyawanDao = karyawanDao;
	}

	@Override
	@Transactional
	public void insert(Karyawan data) {
		//convert dto ke model
		Karyawan karyawan = new Karyawan();
		//bagi dua
		BeanUtils.copyProperties(data, karyawan);
		karyawanDao.insert(karyawan);
	}

	@Override
	@Transactional
	public void update(Karyawan data) {
		karyawanDao.update(data);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		karyawanDao.delete(id);
	}

	@Override
	public Karyawan getByName(String name) {		
		return karyawanDao.getByName(name);
	}

	@Override
	public Karyawan getById(Long id) {
		return karyawanDao.getById(id);
	}

}
