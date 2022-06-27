package com.spring.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("This is a one handler....");
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is two handler....");
		return "enjoy";
	}
	
	@RequestMapping("/home")
	public RedirectView home() {
		System.out.println("This is home handler....");
		RedirectView redirectView = new RedirectView();
		//redirectView.setUrl("contact");
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("This is contact handler");
		return "contact";
	}
	
	@RequestMapping(path = "/emp")
	public RedirectView addEmployee(RedirectAttributes redirectAttributes) {
 
		redirectAttributes.addAttribute("msg", "Welcome to the Company");
		redirectAttributes.addFlashAttribute("name","Pritam Ray");
		redirectAttributes.addFlashAttribute("rollno",1234);
 
		return new RedirectView("welcome");
 
	}
	

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
