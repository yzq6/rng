package com.zhiyou100.ssm.dao;

import java.util.List;

import com.zhiyou100.ssm.vo.Dept;

public interface IDeptDAO {
	List<Dept> findAll();
	Integer create(Dept dept);
	Dept findById(Integer deptId);
	Dept findByName(String  deptName);
	Integer update(Dept dept);
	Integer delete(Integer deptId);

}
