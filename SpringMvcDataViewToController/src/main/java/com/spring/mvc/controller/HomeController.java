package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;

@Controller
public class HomeController {
    
	@ModelAttribute
	public void commonDataForModel(Model model) {
		System.out.println("CommonDataForModel");
		model.addAttribute("Header", "Registation Form");
		model.addAttribute("Desc", "Home For Programmer");
	}

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home Url");
//		model.addAttribute("Header", "Registation Form");
//		model.addAttribute("Desc", "Home For Programmer");
		return "index";
	}

//	@RequestMapping(path = "/showData",method = RequestMethod.POST)
//	public String showData(HttpServletRequest request,Model model ) {
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
//		String phone = request.getParameter("phone");
//		System.out.println(name+" "+email+" "+password+" "+phone);
//		
//		model.addAttribute("name",name);
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);
//		model.addAttribute("phone",phone);
//		return "showData";
//	}

//	@RequestMapping(path = "/showData", method = RequestMethod.POST)
//	public String showData(@RequestParam(name = "name") String userName, @RequestParam(name = "email") String userEmail,
//			@RequestParam(name = "password") String userPassword, @RequestParam(name = "phone") String userPhone,Model model) {
//		System.out.println(userName+" "+userEmail+" "+userPassword+" "+userPhone);
//		
//		User user = new User(userEmail,userPassword,userPhone,userName);
//		
////		model.addAttribute("name",userName);
////		model.addAttribute("email",userEmail);
////		model.addAttribute("password",userPassword);
////		model.addAttribute("phone",userPhone);
//		model.addAttribute("user",user);
//		return "showData";
//	}

	@RequestMapping(path = "/showData", method = RequestMethod.POST)
	public String showData(@ModelAttribute User user, Model model) {
		System.out.println(user);
//    	model.addAttribute("Header","Registation Form");
//		model.addAttribute("Desc","Home For Programmer");
		return "showData";
	}

}
