package com.lawencon.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.spring.dao.BaseDaoImpl;
import com.lawencon.spring.dao.RoleDao;
import com.lawencon.spring.dto.role.InsertDataReq;
import com.lawencon.spring.dto.role.UpdateDataReq;
import com.lawencon.spring.dto.role.UpdateDataRes;
import com.lawencon.spring.dto.role.UpdateDataResData;
import com.lawencon.spring.model.Role;

@Service
public class RoleServiceImpl extends BaseDaoImpl implements RoleService{
	
	private RoleDao roleDAO;
	
	@Autowired
	public void setRoleDao(RoleDao roleDAO) {
		this.roleDAO = roleDAO;
	}

	@Override
	@Transactional
	public Long insert(InsertDataReq data) {
		Role role = new Role();
		BeanUtils.copyProperties(data, role);
		try {
			roleDAO.insert(role);
			return role.getId();
		} catch (Exception e){
			return null;
		}
	}

	@Override
	public Role getById(Long id) {
		String sql = "FROM Karyawan WHERE id = :id";
		List<Role> listObj = em.createQuery(sql, Role.class)
				.setParameter("id", id)
				.getResultList();
		
		return !listObj.isEmpty() ? listObj.get(0) : null;
	}

	@Override
	public Role getByName(String name) {
		String sql = "SELECT FROM tb_m_role WHERE name = :name";
				List<Role> listObj = em.createQuery(sql, Role.class)
				.setParameter("name", name)
				.getResultList();
		
		return !listObj.isEmpty() ? listObj.get(0) : null;
	}

	@Override
	@Transactional
	public UpdateDataRes update(UpdateDataReq datas) {
		Role role = new Role();
		BeanUtils.copyProperties(datas, role);
		Long id = datas.getId();
		UpdateDataRes res = new UpdateDataRes();
		UpdateDataResData data = new UpdateDataResData();
		
		try {
			roleDAO.update(role);
			roleDAO.getById(id);
			return res;
		} catch (Exception e) {
			res.setMsg(e.getMessage());
			res.setData(null);
			return res;
		}
	}

	@Override
	@Transactional
	public void delete(Long id) {
		try {
			roleDAO.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
