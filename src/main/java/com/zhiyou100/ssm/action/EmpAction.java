package com.zhiyou100.ssm.action;


import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.zhiyou100.ssm.service.IEmpService;
import com.zhiyou100.ssm.vo.Emp;

@Controller
@Scope(scopeName="prototype")
@RequestMapping("/pages/emp/*")
public class EmpAction {
	Logger log=Logger.getLogger(EmpAction.class);
	
	@Resource
	private IEmpService empService;
	
	@RequestMapping("login")
	public ModelAndView login(Integer empno, String ename){
		ModelAndView view=new ModelAndView("show");
		Emp vo=empService.findbyid(empno);
		if (vo!=null&&vo.getEname().equals(ename)) {
			List<Emp>list=empService.findall();
			view.addObject("lists", list);
			return view;
			
		}
		return null;
	}
	
	@RequestMapping("add")
	public ModelAndView add(Emp vo) throws Exception {
		System.out.println("===============");
		log.info(vo);
		ModelAndView view=new ModelAndView("show");
	
				log.info("新增员工"+empService.add(vo));
			
			List<Emp> list=empService.findall();
	         view.addObject("lists", list);
		return view;
		}
	@RequestMapping("remove")
	public ModelAndView remove(Integer empno){
		ModelAndView view=new ModelAndView("show");
		log.info("删除的员工"+empService.remove(empno));
		List<Emp>list=empService.findall();
		view.addObject("lists", list);
		return view;
	}
	@RequestMapping("detial1")
	public ModelAndView detial1(){
		ModelAndView view =new ModelAndView("adds");
		
		
		return view;
		
	}
	@RequestMapping("detial")
	public ModelAndView detial(Integer empno){
		ModelAndView view =new ModelAndView("update");
		Emp vo=empService.findbyid(empno);
		view.addObject("emp", vo);
		return view;
		
	}
	@RequestMapping("Update")
	public ModelAndView Update(Emp emp){
		log.info("============="+emp);
		ModelAndView view =new ModelAndView("show");
		view.addObject("emp", emp);
		
		log.info("更新员工"+empService.update(emp));
		List<Emp>list=empService.findall();
		view.addObject("lists", list);
		return view;
	}
	
	@RequestMapping("find1")
	public ModelAndView find1(Integer empno){
		log.info("查询员工"+empService.findbyid(empno));
		
		return null;
	}
	@RequestMapping("findall")
	public ModelAndView findall(){
		List<Emp>list=empService.findall();
		Iterator<Emp> emps=list.iterator();
		while(emps.hasNext()){
			log.info("查询全部"+emps.next());	
		}
		
		
		return null;
	}
	@RequestMapping("findallsplit")
	public ModelAndView findallsplit(@RequestParam(value = "cp", defaultValue = "0") int currPage,
			@RequestParam(value = "ls", defaultValue = "5") int lineSize,
			 String column,
			 String keyWord){
		ModelAndView view=new ModelAndView("show");
		
		Map<String, Object>map=new HashMap<>();
		map.put("column", column);
		map.put("keyword", keyWord);
		map.put("start", currPage);
		map.put("lineSize", lineSize);
		view.addAllObjects(map);
		List<Emp>list=empService.findSplit(map);
		view.addObject("lists", list);
		Iterator<Emp> emps=list.iterator();
		while(emps.hasNext()){
			log.info(emps.next());
		}
		return view;
		
	}
	@RequestMapping("find3")
	public ModelAndView find3(@RequestParam(value = "col", defaultValue = "ename") String column,
			@RequestParam(value = "kw", defaultValue = "%小%") String keyWord){
		Map<String, Object>map=new HashMap<>();
		map.put("column", column);
		map.put("keyword", keyWord);
		long a=empService.findAllSplitCount(map);
		log.info(a);
		return null;
	}
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(java.util.Date.class,
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
    

}
