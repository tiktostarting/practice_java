package com.lawencon.spring.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lawencon.spring.model.Role;

@SpringBootTest
public class RoleDaoTest {
	
	@Autowired
	private RoleDao roleDao;
	
	private Role role = new Role();
	
	@BeforeEach
	public void start(){
		role.setNamaRole("Administrator");
		role.setKodeRole("ADM");
		roleDao.insert(role);
	}
	
	@Test
	@Transactional
	public void insertRole() {
		assertEquals("Administrator", role.getNamaRole(), "Harusnya Role name = Administrator");
		assertEquals("ADM", role.getKodeRole(), "Harusnya Role code = ADM");
	}
	
	@Test
	@Transactional
	public void updateRole() {
		role.setNamaRole("Admin");
		role.setKodeRole("ADM");
		roleDao.update(role);
		
		assertEquals("Admin", role.getNamaRole(), "Harusnya Role name = Admin");
	}
	
	@Test
	@Transactional
	public void deleteRole() {
		roleDao.delete(1L);
	}
}
