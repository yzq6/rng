package com.zhiyou100.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.ssm.dao.IMessageDAO;
import com.zhiyou100.ssm.service.IMessageService;
import com.zhiyou100.ssm.vo.Message;
@Service
public class MessageServiceImpl implements IMessageService {
	@Autowired
	private IMessageDAO messageDao;
	@Override
	public boolean add(Message vo) {
		// TODO Auto-generated method stub
		return messageDao.doCreate(vo);
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return messageDao.doRemove(id);
	}

	@Override
	public boolean edit(Message vo) {
		// TODO Auto-generated method stub
		return messageDao.doUpdate(vo);
	}

	@Override
	public Message findById(Integer id) {
		// TODO Auto-generated method stub
		return messageDao.findById(id);
	}

	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		return messageDao.findAll();
	}

	@Override
	public List<Message> findAllReceive(Integer userId) {
		// TODO Auto-generated method stub
		return messageDao.findAllReceive(userId);
	}

	@Override
	public List<Message> findAllSender(Integer userId) {
		// TODO Auto-generated method stub
		return messageDao.findAllSender(userId);
	}

	@Override
	public List<Message> findAllSave(Message vo) {
		// TODO Auto-generated method stub
		return messageDao.findAllSave(vo);
	}

	@Override
	public List<Message> findAllRemove(Message vo) {
		// TODO Auto-generated method stub
		return messageDao.findAllRemove(vo);
	}

	@Override
	public List<Message> findAllSend(Message vo) {
		// TODO Auto-generated method stub
		return messageDao.findAllSend(vo);
	}

	@Override
	public boolean update(Message vo) {
		// TODO Auto-generated method stub
		return messageDao.update(vo);
	}

	@Override
	public boolean update2(Message vo) {
		// TODO Auto-generated method stub
		return messageDao.update2(vo);
	}

	@Override
	public List<Message> findAllReceive1(Message vo) {
		// TODO Auto-generated method stub
		return messageDao.findAllReceive1(vo);
	}

	@Override
	public List<Message> findAlllike(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return messageDao.findAlllike(map);
	}

	@Override
	public List<Message> findAlllike1(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return messageDao.findAlllike1(map);
	}

}
