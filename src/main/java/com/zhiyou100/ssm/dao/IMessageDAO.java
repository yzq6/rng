package com.zhiyou100.ssm.dao;

import java.util.List;
import java.util.Map;

import com.zhiyou100.ssm.vo.Message;

public interface IMessageDAO {
	public boolean doCreate(Message vo);
	public boolean doRemove(Integer id);
	public boolean doUpdate(Message vo);
	public boolean update(Message vo);
	public boolean update2(Message vo);
	public Message findById(Integer id);
	public List<Message> findAll();
	public List<Message> findAllReceive(Integer userId);
	public List<Message> findAllReceive1(Message vo);
	public List<Message> findAllSender(Integer userId);
	public List<Message> findAllSave(Message vo);
	public List<Message> findAlllike(Map<String, Object> map);
	public List<Message> findAlllike1(Map<String, Object> map);
	public List<Message> findAllSend(Message vo);
	public List<Message> findAllRemove(Message vo);

}
