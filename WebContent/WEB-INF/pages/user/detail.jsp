<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新用户 - 智游客户关系管理系统</title>
<link rel="stylesheet"
	href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>更新用户</h3>
		<form action="">
			<table class="form-table">
				<tr>
					<td>用户名</td>
					<td class="control">${user.userId}</td>
					<td>密码</td>
					<td class="control">${user.password}</td>
				</tr>
				<tr>
					<td>部门</td>
					<td class="control">${user.departmentId }</td>
					<td>角色</td>
					<td class="control">${user.roleId}</td>
				</tr>
				<tr>
					<td>性别</td>
					<td class="control">${user.isMale==true? "男":"女"}</td>
					<td>手机号</td>
					<td class="control">${user.mobile}</td>
				</tr>
				<tr>
					<td>地址</td>
					<td class="control">${user.address}</td>
					<td>年龄</td>
					<td class="control">${user.age}</td>
				</tr>
				<tr>
					<td>固定电话</td>
					<td class="control">${user.tel}</td>
					<td>身份证号</td>
					<td class="control">${user.idNum}</td>
				</tr>
				<tr>
					<td>电子邮箱</td>
					<td class="control">${user.email}</td>
					<td>QQ号</td>
					<td class="control">${user.qq }</td>
				</tr>
				<tr>
					<td>爱好</td>
					<td class="control">${user.hobby}</td>
					<td>学历</td>
					<td class="control"><c:if test="${user.education==0}">

						</c:if> <c:if test="${user.education==1}"> 
                                                                    小学
                       </c:if> <c:if test="${user.education==2}"> 
                                                                  初中
                       </c:if> <c:if test="${user.education==3}"> 
                                                                  高中
                       </c:if> <c:if test="${user.education==4}"> 
                                                                 专科
                       </c:if> <c:if test="${user.education==5}"> 
                                                                 本科
                       </c:if> <c:if test="${user.education==6}"> 
                                                                  硕士
                       </c:if> <c:if test="${user.education==7}"> 
                                                              博士
                       </c:if></td>
				</tr>
				<tr>
					<td>工资卡号</td>
					<td class="control">${user.cardNum}</td>
					<td>民族</td>
					<td class="control">${user.nation }</td>
				</tr>
				<tr>
					<td>婚姻状况</td>
					<td class="control">已婚</td>
					<td></td>
					<td class="control"></td>
				</tr>
				<tr>
					<td>备注</td>
					<td colspan="3" class="control">${user.remark}</td>
				</tr>
			</table>
			<div class="buttons">
				<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
			</div>
		</form>
	</div>
</body>
</html>