package com.critc;

import com.critc.dao.StaffDao;
import com.critc.model.Staff;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class MybatisTest {
	public static void main(String[] args) throws Exception {
		String resource = "configuration.xml";//读取Mybatis的数据库连接配置及mapper配置，
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(reader);//建立数据库连接

		SqlSession session = factory.openSession();//打开连接
		StaffDao staffDao = session.getMapper(StaffDao.class);//加载映射文件

		Staff staff = new Staff();
		staff.setName("Mybatis");
		staffDao.add(staff);//新增

		List<Staff> list = staffDao.list();
		for (Staff staff2 : list) {
			System.out.println(staff2.getName());//查询
		}

		session.commit();//数据提交
		session.close();//连接关闭
	}
}
