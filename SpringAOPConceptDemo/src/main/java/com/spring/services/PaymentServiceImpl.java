package com.spring.services;

import org.springframework.cache.annotation.Cacheable;

public class PaymentServiceImpl implements PaymentService{

	@Cacheable("eventTypes")
	public void makePayment(int amount) {
		
		//payment code
		System.out.println(amount+" Amount Debited...");
		
		System.out.println(amount+" Amount Credited...");
		
	}

}
