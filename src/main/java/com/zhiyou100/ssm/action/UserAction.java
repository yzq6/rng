package com.zhiyou100.ssm.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import com.zhiyou100.ssm.service.IUserService;
import com.zhiyou100.ssm.vo.User;
@Controller
@Scope(scopeName = "prototype")
@RequestMapping("/user/*")
public class UserAction {
	private Logger log=Logger.getLogger(UserAction.class);
	@Resource
	private IUserService service;
	@RequestMapping("login")
	public ModelAndView log(String username,String password){
		ModelAndView view=new ModelAndView("admin");
		if (username.equals("张三") && password.equals("123456")) {
			log.info(username);
			
		}
		
		return view;
	}
	@RequestMapping
	public ModelAndView list(String username,String password){
		ModelAndView view=new ModelAndView("user/list");
		List<User>list=service.findAll();
		view.addObject("userList", list);
		return view;
	}
	@RequestMapping("listview")
	public ModelAndView List(){
		ModelAndView view=new ModelAndView("user/listview");
		List<User>list=service.findAll();
		view.addObject("userList", list);
		return view;
		
	}
	
	@RequestMapping("remove")
	public ModelAndView remove(Integer id){
		log.info(id);
		boolean flag=service.doRemove(id);
		ModelAndView view=new ModelAndView("user/list");
		
			List<User>list=service.findAll();
			view.addObject("userList", list);
				return view;
	}
	@RequestMapping("add")
	public ModelAndView add(User vo){
		ModelAndView view=new ModelAndView("user/add");
		
		return view;
	}
	@RequestMapping("add1")
	public ModelAndView add1(User vo){
		ModelAndView view= new ModelAndView("user/list");
		vo.setCreateTime(new java.sql.Timestamp(new java.util.Date().getTime()));
		vo.setCreater(0);
	boolean flag=service.doCreate(vo);
	if (flag) {
		
		List<User> list=service.findAll();
		view.addObject("userList", list);
		return view;
	}
	return null;
	}
	@RequestMapping("update")
	public ModelAndView update(Integer userId){
		User vo=service.findById(userId);
		
		ModelAndView view=new ModelAndView("user/update");
		view.addObject("user", vo);
		return view;
	}
	@RequestMapping("update1")
	public ModelAndView update1(User vo){
		vo.setUpdateTime(new java.sql.Timestamp(new java.util.Date().getTime()));
		vo.setUpdater(0);
		ModelAndView view=new ModelAndView("user/list");
		ModelAndView view1=new ModelAndView("user/update");
		boolean flag=service.doUpdate(vo);
		if (flag) {
			
			List<User>list=service.findAll();
			view.addObject("userList", list);
			return view;
		}else{
			User user=service.findById(vo.getUserId());
			view.addObject("user", user);
			return view1;
		}
	}
	@RequestMapping("select1")
	public ModelAndView select(String keyword,String searchField){
		ModelAndView view=new ModelAndView("user/list");
		Map<String, Object> map=new HashMap<>();
		map.put("columns", searchField);
		map.put("keyword", "%"+keyword+"%");
		map.put("start", 0);
		map.put("lineSize", 100);
		//view.addAllObjects(map);
		List<User>list=service.findAllSplit(map);
		view.addObject("userList", list);
		return view;
	}
	
	@RequestMapping("select2")
	public ModelAndView select2(String keyword,String column){
		ModelAndView view =new ModelAndView("user/listview");
		Map<String, Object>map=new HashMap<>();
		map.put("columns", column);
		map.put("keyword", "%"+keyword+"%");
		map.put("start", 0);
		map.put("lineSize", 100);
		List<User>list=service.findAllSplit(map);
		view.addObject("userList", list);
		return view;
	}
}
