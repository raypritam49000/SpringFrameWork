package com.springmvc.dispatcherserlet.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

// web.xml
public class WordCountWebConfig implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
        
		// Create to AnnotationWebApplicationContext
		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("classpath:appconfig.xml");
		
		// Create Dispatcher Servlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

		// Register to Dispacter Servlet
		ServletRegistration.Dynamic serve = servletContext.addServlet("myServlet",dispatcherServlet);
		serve.addMapping("/");
		serve.setLoadOnStartup(1);

	}

}
