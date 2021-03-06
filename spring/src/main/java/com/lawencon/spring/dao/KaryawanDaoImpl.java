package com.lawencon.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lawencon.spring.model.Karyawan;

@Repository
public class KaryawanDaoImpl extends BaseDaoImpl implements KaryawanDao{
	@Override
	public void insert(Karyawan data) {
		em.persist(data);
	}

	@Override
	public Karyawan getById(Long id) {
		return em.find(Karyawan.class, id);
	}

	@Override
	public Karyawan getByName(String name) {
		
//		String sql = "select id, username, pass from tb_m_karyawan where username = :name ";
//		List<?> obj = em.createNativeQuery(sql)
//				.setParameter("name", name)
//				.getResultList();
		
//		Karyawan kuli = new Karyawan();
//		obj.forEach(val -> {
//			Object[] data = (Object[]) val;
//			kuli.setId(Long.valueOf(data[0].toString()));
//			kuli.setUsername(data[1].toString());
//			kuli.setPass(data[2].toString());
//		});
		
		String sql = "FROM Karyawan WHERE username = :username";
		List<Karyawan> listObj = em.createQuery(sql, Karyawan.class)
				.setParameter("username", name)
				.getResultList();
		
		return !listObj.isEmpty() ? listObj.get(0) : null;
	}
	
	@Override
	public void update(Karyawan data) {
		em.merge(data);
	}

	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM tb_m_karyawan WHERE id = :id";
		em.createNativeQuery(sql).setParameter("id", id).executeUpdate();
	}
}
