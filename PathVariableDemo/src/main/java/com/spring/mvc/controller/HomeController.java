package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	@RequestMapping("/home/{userId}/{userName}")
	public String home(@PathVariable("userId") int userId,@PathVariable("userName") String userName,Model m) {
		System.out.println("This is Home Handler....");
		System.out.println(userId);
		System.out.println(userName);
		
		m.addAttribute("id", userId);
		m.addAttribute("name",userName);
		return "home";
	}
}
