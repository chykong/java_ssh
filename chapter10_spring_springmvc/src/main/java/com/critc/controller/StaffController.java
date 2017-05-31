package com.critc.controller;

import com.critc.model.Staff;
import com.critc.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	private StaffService staffService;

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		List<Staff> list = staffService.list();
		mv.addObject("list", list);
		mv.setViewName("staff");
		return mv;
	}

	@RequestMapping("/toAdd")
	public ModelAndView toAdd() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		return mv;
	}

	@RequestMapping("/toUpdate")
	public ModelAndView toUpdate(HttpServletRequest request, int id) {
		ModelAndView mv = new ModelAndView();
		Staff staff = staffService.get(id);
		mv.addObject("staff", staff);
		mv.setViewName("update");
		return mv;
	}

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response, Staff staff) {
		staffService.add(staff);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/staff/index.htm");
		return mv;
	}

	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response, Staff staff) {
		staffService.update(staff);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/staff/index.htm");
		return mv;
	}

	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response, int id) {
		staffService.delete(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/staff/index.htm");
		return mv;
	}
}
