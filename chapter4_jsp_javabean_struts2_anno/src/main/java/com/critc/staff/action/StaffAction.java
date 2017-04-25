package com.critc.staff.action;

import com.critc.staff.dao.StaffDao;
import com.critc.staff.model.Staff;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

import java.util.List;

@ParentPackage("struts-default")
@Namespace("/")
@Action("staff")
@Results({ @Result(name = "list", location = "/list.jsp"), @Result(name = "toAdd", location = "/add.jsp"),
		@Result(name = "home", location = "staff!list.action", type = "redirect") })
public class StaffAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Staff> staffList;
	private Staff staff;

	public String list() {
		StaffDao staffDao = new StaffDao();
		staffList = staffDao.list();
		return "list";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String add() {
		StaffDao staffDao = new StaffDao();
		staffDao.add(staff.getName());
		return "home";
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
