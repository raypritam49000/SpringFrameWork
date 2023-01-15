package com.spring.core.model;

public class Message{
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

	public void init() {
		System.out.println("Init method Called....");
	}
	
	public void destroy() {
		System.out.println("Destroy metyhod Called...");
	}
	

}
