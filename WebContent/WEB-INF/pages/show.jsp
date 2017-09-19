<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
</head>
<body>

<div align="center">
<table border="2">
<tr>
<th>员工编号</th>
<th>员工姓名</th>
<th>部门编号</th>
<th>职位</th>
<th>工资</th>
<th>佣金</th>
<th>领导编号</th>
<th>雇佣日期</th>
<th>创建日期</th>
<th colspan="2">操作</th>
</tr>
<c:forEach var="Emp" items="${lists}">
<tr>
<td>${Emp.empno}</td>
<td>${Emp.ename}</td>
<td>${Emp.deptno}</td>
<td>${Emp.job}</td>
<td>${Emp.sal}</td>
<td>${Emp.comm}</td>
<td>${Emp.mgr}</td>
<td>
<fmt:formatDate value="${Emp.hiredate}" type="both" pattern="yyyy-MM-dd HH:mm"/>
</td>
<td>
<fmt:formatDate value="${Emp.createTime}" type="both" pattern="yyyy-MM-dd HH:mm"/>
</td>
<td>
<a href="<c:url value="/pages/emp/remove.action?empno=${Emp.empno}"/>">删除</a>
</td>
<td>
<a href="<c:url value="/pages/emp/detial.action?empno=${Emp.empno}"/>">更新</a>
</td>
</tr>
</c:forEach>
</table>
<a href="<c:url value="/pages/emp/detial1.action"/>"><input type="button" value="新增"></a><br>

</div>
<div align="center">
<form action="<c:url value="/pages/emp/findallsplit.action"/>" method="post">

<input type="text" id="column" name="column" >
<input type="text" id="keyword" name="keyword" >
<input type="submit" value="查询">
</form>
</div>
</body>
</html>