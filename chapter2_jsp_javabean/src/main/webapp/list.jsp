<%@page import="com.critc.staff.Staff"%>
<%@page import="java.util.List"%>
<%@page import="com.critc.staff.StaffDao"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	员工列表
	<a href="add.jsp"> 新增</a>
	<br />

	<table border="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
		</tr>
		<%
			StaffDao staffDao = new StaffDao();
			List<Staff> list = staffDao.list();
			for (Staff staff : list) {
		%>
		<tr>
			<td><%=staff.getId()%></td>
			<td><%=staff.getName()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>