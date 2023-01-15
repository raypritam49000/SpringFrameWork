package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is a Home Url");
		model.addAttribute("name", "Pritam Ray");
		model.addAttribute("rollno", "1710421");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram Kumar");
		list.add("Suraj Mehta");
		model.addAttribute("f", list);
		return "index";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("This is Help Url");
		
		// create the modelandview object
		ModelAndView modelView = new ModelAndView();
		
		// set the data using modelandview
		modelView.addObject("id", "12345");
		modelView.addObject("name", "Rahul Kumar");
		modelView.addObject("fees", "15000");
		
		List<Integer> marks = Arrays.asList(40,560,543,543,87);
		modelView.addObject("marks",marks);
		
		//set the view name
		modelView.setViewName("help");
		
		return modelView;
	}
}
