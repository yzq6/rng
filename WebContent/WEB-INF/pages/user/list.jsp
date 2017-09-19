<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>用户列表</h3>
		<div class="actions">
			<form id="searchForm" action="<c:url value='/user/select1.action'/>"  method="post" >
				<span>搜索内容：</span>
				<input type="text" name="keyword" value="" placeholder="请输入搜索关键词">
				&nbsp;&nbsp;&nbsp;
				<span>搜索字段：</span>
				<select name="searchField">
					<option value="username">用户名</option>
					<option value="mobile">手机号</option>
					<option value="address">地址</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				<input type="submit" class="btn btn-default" value="搜索">
			</form>
			<div>
				<a class="btn btn-primary" href="<c:url value="/user/add.action" />">添加用户</a>
			</div>
		</div>
		<table class="list">
            <tr>
                <th>序号</th>
                <th>用户名</th>
                <th>部门</th>
                <th>角色</th>
                <th>手机号</th>
                <th>邮箱</th>
                <th>更新时间</th>
                <th>操作</th>
            </tr>
            <c:forEach var="user" items="${userList}">
            <tr>
                <td>${user.userId}</td>
                <td>
	                <a title="查看详情" href="<c:url value='/user/detail.action?userId=${user.userId}'/>" >
	                	${user.username}
	                </a>
                </td>
                <td>${user.departmentId}</td>
                <td>${user.roleId}</td>
                <td>${user.mobile}</td>
                <td>${user.email}</td>
                <td>
                	<fmt:formatDate value="${user.updateTime}" type="both" pattern="yyyy-MM-dd HH:mm"/>
                </td>
                <td>
                	<a class="fa fa-pencil" title="编辑" href="<c:url value="/user/update.action?userId=${user.userId}"/>"></a>
                	&nbsp;&nbsp;
                	<a class="fa fa-remove" title="删除" href="javascript:confirmDelete(${user.userId})"></a>
                </td>
            </tr>
           </c:forEach> 
        </table>
        
	</div>
	<script src="<c:url value="/lib/jquery/jquery.js" />"></script>
	<script>
    	function goPage(pageNo) {
    		
    		$('#searchForm').submit();
    	}
    	function confirmDelete(id){
    		if (confirm("确定要删除码？")) {
    			location.href = '<c:url value="/user/remove.action?id=" />' + id
    		}
    	}
    </script>
</body>
</html>