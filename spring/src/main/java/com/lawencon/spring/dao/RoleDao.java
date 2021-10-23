package com.lawencon.spring.dao;

import com.lawencon.spring.model.Role;

public interface RoleDao {
	void insert(Role data) throws Exception;
	void update(Role data) throws Exception;
	void delete(Long id) throws Exception;
	Role getById(Long id) throws Exception;
	Role getByName(String name) throws Exception;
}
