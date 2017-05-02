package com.critc.dao;

import com.critc.model.Staff;

import java.util.List;

public interface StaffDao {
	public int add(Staff staff);

	public int update(Staff staff);

	public int delete(int id);

	public List<Staff> list();
}
