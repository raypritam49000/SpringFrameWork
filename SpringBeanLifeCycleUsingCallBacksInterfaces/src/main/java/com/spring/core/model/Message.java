package com.spring.core.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean,DisposableBean{
	private int id;
	private String message;

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + "]";
	}

	public Message(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is going to Destroy......");
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("Bean is Going through init Process.....");
	}

	

}
