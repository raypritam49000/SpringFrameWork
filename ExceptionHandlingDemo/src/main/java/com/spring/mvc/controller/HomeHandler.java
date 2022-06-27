package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeHandler {

	@RequestMapping("/home")
	public String home() {
		String s = null;
		System.out.println(s.length());
		return "home";
	}

}
