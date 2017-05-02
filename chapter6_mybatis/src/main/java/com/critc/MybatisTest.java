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
		String resource = "configuration.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(reader);

		SqlSession session = factory.openSession();
		StaffDao staffDao = session.getMapper(StaffDao.class);

		Staff staff = new Staff();
		staff.setName("Mybatis");
		staffDao.add(staff);

		List<Staff> list = staffDao.list();
		for (Staff staff2 : list) {
			System.out.println(staff2.getName());
		}

		session.commit();
		session.close();
	}
}
