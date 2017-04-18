package com.critc.staff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 孔垂云
 */
public class StaffDao {
	public Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//指定连接类型  
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test", "root", "root");//获取连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public List<Staff> list() {
		List<Staff> list = new ArrayList<>();
		Connection conn = getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from staff");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Staff staff = new Staff();
				staff.setId(rs.getInt("id"));
				staff.setName(rs.getString("name"));
				list.add(staff);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public void add(String name) {
		Connection conn = getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into staff(name) values(?)");
			pstmt.setString(1, name);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
