package com.springmvc.dispatcherserlet.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.springmvc.springmvcconfiguration.SpringApplicationConfig;

// web.xml
public class WebXmlConfig  extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] classArr = {SpringApplicationConfig.class};
		return classArr;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arrMapping = {"/"};
		return arrMapping;
	}

}
