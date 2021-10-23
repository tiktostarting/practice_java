package com.lawencon.spring.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.lawencon.spring.model.Role;
import com.lawencon.spring.service.RoleService;

@WebMvcTest(controllers = RoleController.class)
public class RoleControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private RoleService roleService;
	
	@Test
	public void insertRole() {
		Role role = new Role();
		role.setNamaRole("Admin");
		role.setKodeRole("ADM");
		
		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/role", role))
			.andExpect(MockMvcResultMatchers.status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findIdByPath() {
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/role/1"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
