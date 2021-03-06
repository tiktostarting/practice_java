package com.lawencon.spring.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.transaction.Transactional;


import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lawencon.spring.model.Karyawan;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class KaryawanDaoTest {
	
	@Autowired
	private KaryawanDao karyawanDao;
	
	private Karyawan pekerja = new Karyawan();
	
//	@BeforeEach
	public void start() {

	}
	
	@Test
	@Order(1)
	@Rollback(false)
	@Transactional
	public void insertKaryawan() {
		pekerja.setUsername("Maintainer");
		karyawanDao.insert(pekerja);
		assertEquals("Maintainer", pekerja.getUsername(), "Benar");
	}
	
	@Test
	@Order(2)
	@Rollback(false)
	@Transactional
	public void cariKaryawan() {
		Karyawan check = karyawanDao.getByName("Maintainer");
		assertNotNull(check);
	}
	
	
	@Test
	@Order(3)
	@Rollback(false)
	@Transactional
	public void updateKaryawan() {
		pekerja.setUsername("Admin");
		pekerja.setPass("1234abc");
		pekerja.setId(1L);
		pekerja.setVersion(0);
		
		karyawanDao.update(pekerja);
	}
	
	@Test
	@Order(4)
	@Rollback(false)
	@Transactional
	public void cekKaryawan() {
		Long id = 1L;
		Karyawan updateLihat = karyawanDao.getById(id);
		assertNotNull(updateLihat);
		assertEquals("Admin", updateLihat.getUsername(), "harusnya ada");
		assertEquals("1234abc", updateLihat.getPass(), "harusnya ada");
	}
	

	@Test
	@Order(6)
	@Rollback(false)
	@Transactional
	public void hapusKaryawan() {
		karyawanDao.delete(1L);
		
		Long id = 1L;
		Karyawan check = karyawanDao.getById(id);
		assertNull(check);
	}
}