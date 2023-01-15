package com.spring.core.entities;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostBeanProcessor2 implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcess2 : postProcessBeforeInitialization : "+bean);
		return bean;
	}
     
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcess2 : postProcessAfterInitialization : "+bean);
		return bean;
	}
	
	
}
