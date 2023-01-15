package com.springcore.beans;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return this.studentName+" "+this.studentId+" "+this.studentAddress;
	}

}
