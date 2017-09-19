package com.zhiyou100.ssm.service;

import java.util.List;

import com.zhiyou100.ssm.vo.Dept;

public interface IDeptService {
	List<Dept> findAll();
	boolean add(Dept dept);
	boolean remove(Integer deptId);
	boolean update(Dept dept);
	Dept checkById(Integer deptId);
	Dept checkByName(String deptName);
}
