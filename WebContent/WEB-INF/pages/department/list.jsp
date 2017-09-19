<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>部门管理 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>部门管理</h3>
		<div class="actions">
			<form></form>
			<div>
				<a class="btn btn-primary" href='<c:url value="/department/addDetail.action" />'>添加部门</a>
			</div>
		</div>
		<table class="list">
            <tr>
                <th>序号</th>
                <th>部门名称</th>
                <th>部门描述</th>
                <th>更新时间</th>
                <th>操作</th>
            </tr>
          <c:forEach var="dept" items="${deptList}"> 
            <tr>
                <td>${dept.deptId}</td>
                <td>${dept.deptName }</td>
                <td>${dept.deptDesc }</td>
                <td>
                	<fmt:formatDate value="${dept.updateTime }" type="both" pattern="yyyy-MM-dd HH:mm"/>
                </td>
                <td>
                	<a class="fa fa-pencil" title="编辑" href="javascript:skipUpdate(${dept.deptId})"></a>
                	&nbsp;&nbsp;
                	<a class="fa fa-remove" title="删除" href="javascript:confirmDelete(${dept.deptId})"></a>
                </td>
            </tr>
           </c:forEach> 
        </table>
	</div>
	<script src="<c:url value="/lib/jquery/jquery.js" />"></script>
	<script>
    	function confirmDelete(id){
    		if (confirm("确定要删除码？")) {
    			location.href = '<c:url value="/department/remove.action?id=" />' + id
    		}
    	}
    	function skipUpdate(id){
    		location.href='<c:url value="/department/updateDetail.action?id=" />' + id
    	}
    </script>
</body>
</html>