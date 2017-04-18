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

	<%
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//指定连接类型  
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/px", "root", "root");//获取连接  
		} catch (Exception e) {
			e.printStackTrace();
		}
		String name = request.getParameter("name");
		PreparedStatement pstmt = conn.prepareStatement("insert into staff(name) values(?)");
		pstmt.setString(1, name);
		pstmt.executeUpdate();
		conn.close();
		response.sendRedirect("list.jsp");
	%>
</body>
</html>