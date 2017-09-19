package com.zhiyou100.ssm.action;

import org.json.JSONArray;
import org.json.JSONObject;

public class Json {
	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("deptno", 10);
		obj.put("dname", "教学部");
		obj.put("loc", "郑州");
//		JSONArray array = new JSONArray();
//		array.put("ERP系统"); // ERP:企业资源管理
//		array.put("CRM系统");
//		array.put("HR系统");
//		array.put("OA系统");
//obj.put("as", array);
		JSONArray emps = new JSONArray();
		for(int x=0; x<3; x++) {
		JSONObject emp = new JSONObject();
		emp.put("empno", x);
		emp.put("ename", "张三-" + x);
		emp.put("salary", 10000 * x);
		emps.put(emp);
		}
		obj.put("allEmps", emps); 
		String str = obj.toString();
		System.out.println(str);
	}

}
