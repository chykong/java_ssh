package com.critc;

import com.critc.model.Staff;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateTest {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //新增
        Staff staff = new Staff();
        staff.setName("Hibernate");
        session.save(staff);
        //获取单个
        Staff staff2 = (Staff) session.get(Staff.class, staff.getId());
        if (staff2 != null)
            System.out.println(staff2.getName());
        //修改
        staff2.setName("改后名字Hibernate2");
        session.save(staff2);

        //查询 HQL
        Query q = session.createQuery("from Staff");
        List<Staff> list = q.list();
        for (Staff staff3 : list) {
            System.out.println(staff3.getName());
        }

        //删除
//		session.delete(staff2);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
