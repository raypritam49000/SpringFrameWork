package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is Home URL");
		return "index";
	}
	
    @RequestMapping("/about")	
	public String about() {
		System.out.println("This is About URL");
		return "about";
	}
    
    @RequestMapping("/help")	
	public String help() {
		System.out.println("This is Help URL");
		return "help";
	}
    
    @RequestMapping("/services")	
  	public String services() {
  		System.out.println("This is Services URL");
  		return "services";
  	}
}
