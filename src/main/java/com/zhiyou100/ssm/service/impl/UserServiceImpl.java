package com.zhiyou100.ssm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhiyou100.ssm.dao.IUserDAO;
import com.zhiyou100.ssm.service.IUserService;
import com.zhiyou100.ssm.vo.User;
@Service
public class UserServiceImpl implements IUserService{
	 @Resource
	private IUserDAO dao;
	 
	 @Override
		public boolean doCreate(User vo) {
			
			return dao.doCreate(vo);
		}
	

	@Override
	public boolean doRemove(Integer id) {
		
		return dao.doDelete(id);
	}

	@Override
	public boolean doUpdate(User vo) {
		
		return dao.doUpdate(vo);
	}

	@Override
	public User findById(Integer id) {
		
		return dao.findById(id);
	}

	@Override
	public List<User> findAll() {
		
		return dao.findAll();
	}

	@Override
	public List<User> findAllSplit(Map<String, Object> map) {
		
		return dao.findAllSplit(map);
	}

	@Override
	public Long getAllCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findAllSplitCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List<User> findAllReceiver() {
		// TODO Auto-generated method stub
		return dao.findAllReceiver();
	}

	

}
