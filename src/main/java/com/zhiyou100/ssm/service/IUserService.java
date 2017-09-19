package com.zhiyou100.ssm.service;

import java.util.List;
import java.util.Map;


import com.zhiyou100.ssm.vo.User;

public interface IUserService {
	
	 public boolean doCreate(User vo);
	/** 单个删除 */
   public boolean doRemove(Integer id);
   
   /** 数据修改*/
	public boolean doUpdate(User vo);
	
	/** 根据主键查询 */
	public User findById(Integer id);
	
	/**查询全部*/
	public List<User> findAll();
	
	public List<User> findAllReceiver();
	
	
	
	/** 分页模糊查询 */
	public List<User> findAllSplit(Map<String, Object> map);
	
	/** 统计全部数据量 */
	public Long getAllCount();
	
	/** 统计查询数据量 */
	public long findAllSplitCount(Map<String, Object> map);
	

}
