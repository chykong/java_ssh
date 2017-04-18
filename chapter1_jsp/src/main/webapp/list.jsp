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
			Connection conn = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");//指定连接类型  
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test", "root", "root");//获取连接
			} catch (Exception e) {
				e.printStackTrace();
			}
			PreparedStatement pstmt = conn.prepareStatement("select * from staff");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
		</tr>
		<%
			}
			conn.close();
		%>
	</table>
</body>
</html>