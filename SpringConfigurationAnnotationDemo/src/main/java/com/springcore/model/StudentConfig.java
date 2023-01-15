package com.springcore.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.model")
public class StudentConfig {

	@Bean
	public Collage getCollage() {
		Collage collage = new Collage();
		return collage;
	}
	
	@Bean
	public Student getStudent() {
	Student student = new Student();
	student.setCollage(getCollage());
		return student;
	}
	
}
