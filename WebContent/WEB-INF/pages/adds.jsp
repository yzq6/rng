<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增页面</title>
</head>
<body>
<form action="<c:url value="/pages/emp/add.action"/>"  method="post">
	<div align="center">
		<table border="5">
			<tr>
				<th>员工编号</th> <td><input type="text" name="empno" value=""></td>
			</tr>
			<tr>
				<th>员工姓名</th> <td><input type="text" name="ename" value=""></td>
			</tr>
			<tr>
				<th>部门编号</th> <td><input type="text" name="deptno" value=""></td>
			</tr>
			<tr>
				<th>职位</th> <td><input type="text" name="job" value=""></td>
			</tr>
			<tr>
				<th>工资</th> <td><input type="text" name="sal" value=""></td>
			</tr>
			<tr>	
				<th>佣金</th> <td><input type="text" name="comm" value=""></td>
			</tr>
			<tr>	
				<th>领导编号</th> <td><input type="text" name="mgr" value=""></td>
			</tr>
			<tr>	
				<th>雇佣日期</th> <td><input type="text" name="hiredate" value=""> </td>
			</tr>
			<tr>	
				<th>创建日期</th> <td><input type="text" name="createTime" value=""></td>
			</tr>
			<tr>	
				<th colspan="2"><input type="submit" value="保存"></th>
			</tr>
		</table>
	</div>
</form>

</body>
</html>