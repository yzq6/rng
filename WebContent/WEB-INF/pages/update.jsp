<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改页面</title>
</head>
<body>
<form action="<c:url value="/pages/emp/Update.action"/>"  method="post">
	<div align="center">
		<table border="10">
			<tr>
				<th>员工编号</th> <td><input type="text" name="empno" value="${emp.empno}"></td>
			</tr>
			<tr>
				<th>员工姓名</th> <td><input type="text" name="ename" value="${emp.ename}"></td>
			</tr>
			<tr>
				<th>部门编号</th> <td><input type="text" name="deptno" value="${emp.deptno }"></td>
			</tr>
			<tr>
				<th>职位</th> <td><input type="text" name="job" value="${emp.job}"></td>
			</tr>
			<tr>
				<th>工资</th> <td><input type="text" name="sal" value="${emp.sal}"></td>
			</tr>
			<tr>	
				<th>佣金</th> <td><input type="text" name="comm" value="${emp.comm}"></td>
			</tr>
			<tr>	
				<th>领导编号</th> <td><input type="text" name="mgr" value="${emp.mgr}"></td>
			</tr>
			<tr>	
				<th>雇佣日期</th> <td><fmt:formatDate  value="${emp.hiredate}" type="both" pattern="yyyy-MM-dd HH:mm"/></td>
			</tr>
			<tr>	
				<th>创建日期</th> <td><fmt:formatDate  value="${emp.createTime}" type="both" pattern="yyyy-MM-dd HH:mm"/></td>
			</tr>
			<tr>	
				<th colspan="2"><input type="submit" value="保存"></th>
			</tr>
		</table>
	</div>
</form>
</body>
</html>