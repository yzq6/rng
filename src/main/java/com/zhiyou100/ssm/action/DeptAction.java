package com.zhiyou100.ssm.action;



import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhiyou100.ssm.service.IDeptService;
import com.zhiyou100.ssm.vo.Dept;

@Controller
@Scope(scopeName = "prototype")
@RequestMapping("/department/*")
public class DeptAction {
	
	@Resource
	private IDeptService service;
	private Logger log=Logger.getLogger(DeptAction.class);
	
	@RequestMapping("listview")
	public ModelAndView goListView(){
		List<Dept>list=service.findAll();
		ModelAndView view=new ModelAndView("department/listview");
		view.addObject("deptList", list);
		return view;
	}
	@RequestMapping("list")
	public ModelAndView goList(){
		List<Dept>list=service.findAll();
		ModelAndView view=new ModelAndView("department/list");
		view.addObject("deptList", list);
		return view;
	}

}
