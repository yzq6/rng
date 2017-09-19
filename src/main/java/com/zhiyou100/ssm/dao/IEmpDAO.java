package com.zhiyou100.ssm.dao;

import java.util.List;
import java.util.Map;

import com.zhiyou100.ssm.vo.Emp;

public interface IEmpDAO {
	public boolean Create(Emp vo);
	
	public boolean doRemove(Integer empno);
	
	public boolean doUpdate(Emp vo);
	
	public Emp findById(Integer empno);
	
	public List<Emp> findAll();
	
	public long findAllCount();
	
	public List<Emp> findAllSplit(Map<String, Object> map);
	
	public long findAllSplitCount(Map<String, Object> map);

}
