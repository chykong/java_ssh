<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	员工列表
	<a href="staff!toAdd.action"> 新增</a>
	<br />

	<table border="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
		</tr>
		<s:iterator value="staffList" var="staff">
			<tr>
				<td>${staff.id }</td>
				<td>${staff.name}</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>