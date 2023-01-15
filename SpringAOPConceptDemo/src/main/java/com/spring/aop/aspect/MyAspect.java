package com.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	// advices
	@Before("execution(* com.spring.services.PaymentServiceImpl.makePayment(..))")
	public void printBefore() {
		System.out.println("Payment Starting....");
	}
	
	@After("execution(* com.spring.services.PaymentServiceImpl.makePayment(..))")
	public void printAfter() {
		System.out.println("Payment Done....");
	}
}
