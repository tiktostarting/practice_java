package com.lawencon.spring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lawencon.spring.model.Karyawan;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class KaryawanServiceTest {
	
	@Autowired
	private KaryawanService karyawanService;
	
	Karyawan pekerja = new Karyawan();
	
	@Test
	@Order(1)
	@Rollback(false)
	public void insertKaryawan() {
		pekerja.setUsername("Maintainer");
		karyawanService.insert(pekerja);
		assertEquals("Maintainer", pekerja.getUsername(), "Benar");
	}
	
	@Test
	@Order(2)
	@Rollback(false)
	public void cariKaryawan() {
		Karyawan check = karyawanService.getByName("Maintainer");
		assertNotNull(check);
	}
	
	@Test
	@Order(3)
	@Rollback(false)
	public void updateKaryawan() {
		pekerja.setUsername("Admin");
		pekerja.setPass("1234abc");
		pekerja.setId(1L);
		pekerja.setVersion(0);
		
		karyawanService.update(pekerja);
	}
	
	@Test
	@Order(4)
	@Rollback(false)
	public void cekKaryawan() {
		Long id = 1L;
		Karyawan updateLihat = karyawanService.getById(id);
		assertNotNull(updateLihat);
		assertEquals("Admin", updateLihat.getUsername(), "harusnya ada");
		assertEquals("1234abc", updateLihat.getPass(), "harusnya ada");
	}
	
	@Test
	@Order(5)
	@Rollback(false)
	public void hapusKaryawan() {
		karyawanService.delete(1L);
		Long id = 1L;
		Karyawan check = karyawanService.getById(id);
		assertNull(check);
	}	
}
