package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(path = "/welcome",method = RequestMethod.POST)
	public String welcome(@RequestParam("name") String name,Model m) {
		m.addAttribute("name",name);
		return "welcome";
	}
	
}
