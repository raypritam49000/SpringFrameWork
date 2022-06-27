package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.model.Student;

@Controller
public class FormController {
 
	@RequestMapping("/complex")
	public String home() {
		return "complex";
	}
	
	@RequestMapping(path = "/handle",method = RequestMethod.POST)
	public String regitser(@ModelAttribute("student") Student student,BindingResult result) {
		
		if(result.hasErrors()) {
			return "complex";
		}
		
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}
}
