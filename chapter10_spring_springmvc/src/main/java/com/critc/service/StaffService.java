package com.critc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.critc.dao.StaffDao;
import com.critc.model.Staff;

@Service
public class StaffService {
	@Autowired
	private StaffDao staffDao;

	public void add(Staff staff) {
		staffDao.add(staff);
	}

	public void update(Staff staff) {
		staffDao.update(staff);
	}

	public void delete(int id) {
		staffDao.delete(id);
	}

	public List<Staff> list() {
		return staffDao.list();
	}

	public Staff get(int id) {
		return staffDao.get(id);
	}

}
