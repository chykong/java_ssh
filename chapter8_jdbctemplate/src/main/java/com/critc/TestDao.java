package com.critc;

import com.critc.dao.StaffDao;
import com.critc.model.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 孔垂云 on 2017/5/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TestDao {
    @Autowired
    private StaffDao staffDao;

    @Test
    public void testAdd() {
        Staff staff = new Staff();
        staff.setName("JDBCTemplate");
        staffDao.add(staff);
    }

    @Test
    @Rollback(false)
    public void testList() {
        System.out.println(staffDao.list().size());
    }
}
