<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<div align="center">
	<form action="<c:url value="/pages/emp/login.action"/>" method="post">
		<div>
			<input type="text" id="empno" name="empno" value=""
				placeholder="请输入用户ID....">
		</div>

		<div>
			<input type="text" id="ename" name="ename" value=""
				placeholder="请输入用户名...">
		</div>
		
		<div>
		 	<input type="submit" value="登录">
		</div>

	</form>
</div>

</body>
</html>