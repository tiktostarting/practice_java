package com.lawencon.spring.service;

import com.lawencon.spring.dto.role.InsertDataReq;
import com.lawencon.spring.dto.role.UpdateDataReq;
import com.lawencon.spring.dto.role.UpdateDataRes;
import com.lawencon.spring.model.Role;

public interface RoleService {
	Long insert(InsertDataReq data);
	UpdateDataRes update(UpdateDataReq data);
	void delete(Long id);
	Role getById(Long id);
	Role getByName(String name);
}
