package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.model.User;
import com.spring.mvc.services.UserServices;

@Controller
public class HomeController {
	@Autowired
	private UserServices userServices;

	@RequestMapping("/home")
	public String home() {
		System.out.println("This is Home Url");
		return "index";
	}

	@RequestMapping(path = "/showData", method = RequestMethod.POST)
	public String showData(@ModelAttribute User user, Model model) {
		System.out.println(user);
		int id = (Integer)this.userServices.createUser(user);
		model.addAttribute("msg","Use are Saved sucessfully id "+id);
		return "showData";
	}

	public UserServices getUserServices() {
		return userServices;
	}

	public void setUserServices(UserServices userServices) {
		this.userServices = userServices;
	}

}
