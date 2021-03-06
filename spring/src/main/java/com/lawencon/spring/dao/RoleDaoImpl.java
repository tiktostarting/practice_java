package com.lawencon.spring.dao;

import org.springframework.stereotype.Repository;

import com.lawencon.spring.model.Role;

@Repository
public class RoleDaoImpl extends BaseDaoImpl implements RoleDao{

	@Override
	public void insert(Role data) {
		em.persist(data);
	}

	@Override
	public Role getById(Long id) {
		return em.find(Role.class, id);
	}

	@Override
	public Role getByName(String name) {
		return em.find(Role.class, name);
	}

	@Override
	public void update(Role data) {
		em.merge(data);
		
	}

	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM tb_m_role WHERE id = :id";
		em.createNativeQuery(sql).setParameter("id", id).executeUpdate();
	}
}
