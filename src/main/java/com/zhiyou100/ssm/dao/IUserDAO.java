package com.zhiyou100.ssm.dao;

import java.util.List;
import java.util.Map;



import com.zhiyou100.ssm.vo.User;

public interface IUserDAO {
	
    public boolean doCreate(User vo);
	
	
	
	/** 单个删除 */
   public boolean doDelete(Integer id);
   
   /** 数据修改*/
	public boolean doUpdate(User vo);
	
	/** 根据主键查询 */
	public User findById(Integer id);
	
	/**查询全部*/
	public List<User> findAll();
	
	
	
	/** 分页模糊查询 */
	public List<User> findAllSplit(Map<String, Object> map);
	
	public List<User> findAllReceiver();
}
