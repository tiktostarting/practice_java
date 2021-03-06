package com.lawencon.spring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lawencon.spring.model.Role;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@SpringBootTest
public class RoleServiceTest {
	 
	@Autowired
	private RoleService roleService;
	
	Role role = new Role();
	
	@Test
	@Order(1)
	@Rollback(false)
	@Transactional
	public void insertKaryawan() {
//		InsertData
//		role.setNamaRole("Maintainer");
//		BeanUtils.copyProperties(role, target);
		
//		roleService.insert(role);
		assertEquals("Maintainer", role.getNamaRole(), "Benar");
	}
	
	@Test
	@Order(2)
	@Rollback(false)
	@Transactional
	public void cariKaryawan() {
		Role check = roleService.getByName("Maintainer");
		assertNotNull(check);
	}
	
	
	@Test
	@Order(3)
	@Rollback(false)
	@Transactional
	public void updateKaryawan() {
		role.setNamaRole("Admin");
		role.setKodeRole("1234abc");
		role.setId(1L);
		role.setVersion(0);
		
		roleService.update(role);
	}
	
	@Test
	@Order(4)
	@Rollback(false)
	@Transactional
	public void cekKaryawan() {
		Long id = 1L;
		Role updateLihat = roleService.getById(id);
		assertNotNull(updateLihat);
		assertEquals("Admin", updateLihat.getNamaRole(), "harusnya ada");
		assertEquals("1234abc", updateLihat.getKodeRole(), "harusnya ada");
	}
	

	@Test
	@Order(5)
	@Rollback(false)
	@Transactional
	public void hapusKaryawan() {
		roleService.delete(1L);
		Long id = 1L;
		Role check = roleService.getById(id);
		assertNull(check);
	}
}
