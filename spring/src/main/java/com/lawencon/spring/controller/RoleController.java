package com.lawencon.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.spring.model.Role;
import com.lawencon.spring.service.RoleService;
import com.lawencon.spring.dto.role.InsertDataRes;
import com.lawencon.spring.dto.role.InsertDataResData;
import com.lawencon.spring.dto.role.InsertDataReq;
import com.lawencon.spring.dto.role.UpdateDataReq;
import com.lawencon.spring.dto.role.UpdateDataRes;
import com.lawencon.spring.dto.role.UpdateDataResData;

@RestController
@RequestMapping ("role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping
	public ResponseEntity<?> insertRole(@RequestBody InsertDataReq role) {
		Long id = roleService.insert(role);
		
		InsertDataRes response = new InsertDataRes();
		InsertDataResData data = new InsertDataResData();
		
		data.setId(id);
		response.setData(data);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping ("{id}")
	public ResponseEntity<?> getRoleById(@PathVariable("id") Long id){
		Role outputs = roleService.getById(id);
		if(outputs == null) {
			return new ResponseEntity<>("Maaf data yang anda cari tidak ada", HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<>(outputs, HttpStatus.OK);
		}
	}
	
	@PutMapping
	public ResponseEntity<?> updateRole(@RequestBody UpdateDataReq role){
		roleService.update(role);
		
		UpdateDataRes response = new UpdateDataRes();
		UpdateDataResData data = new UpdateDataResData();
		
		return new ResponseEntity<>("berhasil update", HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteRoleById(@PathVariable("id") Long id){
		roleService.delete(id);
		return new ResponseEntity<>("berhasil hapus", HttpStatus.OK);
	}
}
