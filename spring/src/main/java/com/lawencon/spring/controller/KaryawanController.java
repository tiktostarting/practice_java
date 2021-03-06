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

import com.lawencon.spring.model.Karyawan;
import com.lawencon.spring.service.KaryawanService;

@RestController
@RequestMapping("karyawan")
public class KaryawanController {
	
	@Autowired
	private KaryawanService karyawanService;
	
	@PostMapping
	public ResponseEntity<?> insertDataKaryawan(@RequestBody Karyawan pekerja) {
		karyawanService.insert(pekerja);
		return new ResponseEntity<>(pekerja, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> getDataKaryawanById(@PathVariable("id") Long id){
		Karyawan data = karyawanService.getById(id);
		if(data == null) {
			return new ResponseEntity<>("Maaf data yang anda cari tidak ada", HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<>(data, HttpStatus.OK);
		}
	}
	
	@PutMapping
	public ResponseEntity<?> updateDataKaryawan(@RequestBody Karyawan pekerja){
		karyawanService.update(pekerja);
		return new ResponseEntity<>("berhasil update", HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteDataKaryawanById(@PathVariable("id") Long id){
		karyawanService.delete(id);
		return new ResponseEntity<>("berhasil hapus", HttpStatus.OK);
	}
}
