package com.zhiyou100.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.zhiyou100.ssm.dao.IDeptDAO;
import com.zhiyou100.ssm.service.IDeptService;
import com.zhiyou100.ssm.vo.Dept;
@Service
@Repository
public class DeptServiceImpl implements IDeptService {

	@Resource
	private IDeptDAO dao;
	
	@Override
	public List<Dept> findAll() {
		
		return dao.findAll();
	}

	@Override
	public boolean add(Dept dept) {
		if(dao.findByName(dept.getDeptName())==null){
			return dao.create(dept)==1;
		}
		return false;
	}

	@Override
	public boolean remove(Integer deptId) {
		
		return dao.delete(deptId)==1;
	}

	@Override
	public boolean update(Dept dept) {
		
		return dao.update(dept)==1;
	}

	@Override
	public Dept checkById(Integer deptId) {
		
		return dao.findById(deptId);
	}

	@Override
	public Dept checkByName(String deptName) {
		
		return dao.findByName(deptName);
	}

}
