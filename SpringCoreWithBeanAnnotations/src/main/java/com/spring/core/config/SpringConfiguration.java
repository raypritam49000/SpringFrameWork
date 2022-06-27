package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfiguration {
    
	@Bean
	public EmployeeManagerImp getEmployee() {
		return new EmployeeManagerImp();
	}
}
