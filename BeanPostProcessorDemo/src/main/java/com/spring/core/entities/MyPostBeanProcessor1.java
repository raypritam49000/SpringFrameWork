package com.spring.core.entities;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostBeanProcessor1 implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcess1 : postProcessBeforeInitialization : "+bean);
		return bean;
	}
     
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcess1 : postProcessAfterInitialization : "+bean);
		return bean;
	}
	
	
}
