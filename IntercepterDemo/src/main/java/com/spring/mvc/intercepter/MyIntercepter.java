package com.spring.mvc.intercepter;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyIntercepter extends HandlerInterceptorAdapter {
 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
		  System.out.println("This is PreHandler....");
		  String name = request.getParameter("name");
		  if(name.startsWith("d")) 
		  {
			  response.setContentType("text/html");
			  PrintWriter out = response.getWriter();
			  out.println("Invalid name.... names should not starts with d");
			  return false;
		  }
		  return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
		  System.out.println("This is PostHandler....");
	}
	
	@Override
	public void afterCompletion( HttpServletRequest request, HttpServletResponse response,Object handler, Exception ex) {
	    System.out.println("This is afterCompletion handler.....");
	}
	
	
}

