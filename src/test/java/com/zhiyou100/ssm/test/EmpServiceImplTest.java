package com.zhiyou100.ssm.test;

import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou100.ssm.service.IEmpService;
import com.zhiyou100.ssm.util.DateUtil;
import com.zhiyou100.ssm.vo.Emp;

import junit.framework.TestCase;

public class EmpServiceImplTest {
	private static ApplicationContext myctx=null;
	private static Integer empno;
	private Logger log =Logger.getLogger(EmpServiceImplTest.class);
	static{
		empno=new Random().nextInt(10000);
		myctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	IEmpService service=myctx.getBean("serviceImpl",IEmpService.class);
	@Test
	public void testAdd() throws Exception{
		IEmpService service=myctx.getBean("serviceImpl",IEmpService.class);
		Emp vo = new Emp();
		vo.setEmpno(empno);
		vo.setDeptno(new Random().nextInt(100));
		vo.setEname("小刚" + empno);
		vo.setJob("程序员");
		vo.setSal((double) Math.round(new Random().nextDouble()*30000));
		vo.setComm((double) Math.round(new Random().nextDouble()*50000));
		vo.setMgr(new Random().nextInt(10000));
		Date date = DateUtil.randomDate("1997-08-21", "2017-08-21", 3650*2).get(0);
		vo.setHiredate(date);
		vo.setCreateTime(date);
		boolean flag = service.add(vo);
		TestCase.assertTrue(flag);
		log.info(flag);
	}
   
	@Test 
	public void testRemove(){
		IEmpService service=myctx.getBean("serviceImpl", IEmpService.class);
		boolean flag=service.remove(2473);
		log.info(flag);
	}
	
	@Test 
	public void testUpdata(){
		Emp vo = new Emp();
		vo.setEmpno(3004);
		vo.setDeptno(new Random().nextInt(100));
		vo.setEname("小红" + empno);
		vo.setJob("程序员");
		vo.setSal((double) Math.round(new Random().nextDouble()*30000));
		vo.setComm((double) Math.round(new Random().nextDouble()*50000));
		vo.setMgr(new Random().nextInt(10000));
		Date date = DateUtil.randomDate("1997-08-21", "2017-08-21", 3650*2).get(0);
		vo.setHiredate(date);
		vo.setCreateTime(date);
		boolean falg=service.update(vo);
		log.info(falg);
		
	}
	@Test
	public void testfindbyid(){
		Emp vo=service.findbyid(3004);
		log.info(vo);
	}

}
