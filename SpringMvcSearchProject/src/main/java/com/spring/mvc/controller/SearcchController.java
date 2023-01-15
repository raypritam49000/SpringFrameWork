package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearcchController {

	
	@RequestMapping("/home")
	private String home() {
		System.out.println("This is Home View...");
		return "home";
	}
	
	@RequestMapping("/search")
	private RedirectView search(@RequestParam("querybox") String query) {
		String url = "https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
}
