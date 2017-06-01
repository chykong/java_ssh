package com.critc.service;

import com.critc.dao.StaffDao;
import com.critc.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author  孔垂云
 * Date  2017/6/2.
 */
@Service
public class StaffService2 {
    @Autowired
    private StaffDao staffDao;

    @Transactional
    public void add() {
        Staff staff = new Staff();
        staff.setName("JDBCTemplate");
        staffDao.add(staff);

        Staff staff2 = new Staff();
        staff2.setName("JDBCTemplate123456789");
        staffDao.add(staff2);
    }
}
