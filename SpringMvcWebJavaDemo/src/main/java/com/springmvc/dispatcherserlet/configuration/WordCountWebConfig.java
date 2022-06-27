package com.springmvc.dispatcherserlet.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.springmvc.springmvcconfiguration.SpringApplicationConfig;

// web.xml
public class WordCountWebConfig implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
        
		// Create to AnnotaionConfigWebApplicationContext
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(SpringApplicationConfig.class);
		
		// Create Dispatcher Servlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

		// Register to Dispacter Servlet
		ServletRegistration.Dynamic servlet = servletContext.addServlet("myServlet",dispatcherServlet);
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
        System.out.println(servlet.getClassName());
        System.out.println(servlet.getName());
	}

}
