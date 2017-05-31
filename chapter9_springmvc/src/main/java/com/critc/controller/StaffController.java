package com.critc.controller;

import com.critc.dao.StaffDao;
import com.critc.model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		StaffDao staffDao = new StaffDao();
		List<Staff> list = staffDao.list();
		mv.addObject("list", list);
		mv.setViewName("staff");
		return mv;
	}
}
