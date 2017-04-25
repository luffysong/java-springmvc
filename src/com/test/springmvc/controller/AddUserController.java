package com.test.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.test.springmvc.bean.User;

public class AddUserController extends SimpleFormController {
	
	@SuppressWarnings("unchecked")
	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("depts", new String[]{"dept1","dept2","dept3"});
		return model;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		User user = (User)command;
		System.out.println(user.getId()+","+user.getName()+","+user.getDept());
		return new ModelAndView(this.getSuccessView());
	}

}
