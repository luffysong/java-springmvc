package com.test.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserMultiActionController extends MultiActionController {
	
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		model.setViewName("addUser");
		model.addObject("depts",new String[]{"dept1","dept2","dept3"});
		return model;
	}
	
	public ModelAndView editUser(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserMultiActionController's editUser mothod");
		return null;
	}
}
