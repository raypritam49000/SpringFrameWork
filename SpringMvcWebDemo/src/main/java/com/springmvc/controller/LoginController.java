package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
 
	//@ResponseBody
	@RequestMapping("/login")
	public String login() {
	 return "login";	
	}
}
