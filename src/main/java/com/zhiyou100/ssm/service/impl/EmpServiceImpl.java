package com.zhiyou100.ssm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhiyou100.ssm.dao.IEmpDAO;
import com.zhiyou100.ssm.service.IEmpService;
import com.zhiyou100.ssm.vo.Emp;
@Service("serviceImpl")
public class EmpServiceImpl implements IEmpService {

	@Resource
	private IEmpDAO empDao;
	@Override
	public boolean add(Emp vo){
		
		return empDao.Create(vo);
	}
	@Override
	public boolean remove(Integer empno) {
		
		return empDao.doRemove(empno);
	}
	@Override
	public boolean update(Emp vo) {
		
		return empDao.doUpdate(vo);
	}
	@Override
	public Emp findbyid(Integer empno) {
		
		return empDao.findById(empno);
	}
	@Override
	public List<Emp> findall() {
		
		return empDao.findAll();
	}
	@Override
	public List<Emp> findSplit(Map<String, Object> map) {
		
		return empDao.findAllSplit(map);
	}
	@Override
	public long findAllSplitCount(Map<String, Object> map) {
		
		return empDao.findAllSplitCount(map);
	}

}
