package com.critc.staff;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class StaffAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Staff> staffList;
	private Staff staff;

	public String list() {
		StaffDao staffDao = new StaffDao();
		staffList = staffDao.list();
		return "success";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String add() {
		StaffDao staffDao = new StaffDao();
		staffDao.add(staff.getName());
		return "addResult";
	}

	public void setStaffList(List<Staff> staffList) {
		this.staffList = staffList;
	}

	public List<Staff> getStaffList() {
		return staffList;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
}
