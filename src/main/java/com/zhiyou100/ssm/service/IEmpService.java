package com.zhiyou100.ssm.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.ssm.vo.Emp;

public interface IEmpService {
	
	public boolean add(Emp vo) throws Exception;
	
	public boolean remove(Integer empno);
	
	public boolean update(Emp vo);
	
	public Emp findbyid(Integer empno);
	
	public List<Emp> findall();
	
	public List<Emp> findSplit(Map<String, Object> map);

	public long findAllSplitCount(Map<String, Object> map);
}
