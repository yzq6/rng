package com.zhiyou100.ssm.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.ssm.vo.Message;

public interface IMessageService {
	public boolean add(Message vo);
	public boolean delete(Integer id);
	public boolean edit(Message vo);
	public Message findById(Integer id);
	public List<Message> findAll();
	public boolean update(Message vo);
	public boolean update2(Message vo);
	/** 当前登录的用户的收件箱 
	 * @return */
	public List<Message> findAllReceive(Integer userId);
	public List<Message> findAllReceive1(Message vo);
	public List<Message> findAllSender(Integer userId);
	public List<Message> findAllSave(Message vo);
	public List<Message> findAllSend(Message vo);
	public List<Message> findAlllike1(Map<String, Object> map);
	public List<Message> findAlllike(Map<String, Object> map);
	public List<Message> findAllRemove(Message vo);

}
