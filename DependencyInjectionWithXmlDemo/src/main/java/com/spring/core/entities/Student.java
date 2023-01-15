package com.spring.core.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

public class Student {
	private int id;
	private String name;
	private List<Double> salary;
	private ArrayList<String> address;
	private Set<Long> phone;
	private Vector<String> subject;
	private Map<String, Double> marks;
	private Properties qusAns;
	private Course course;

	public Student(int id, String name, List<Double> salary, ArrayList<String> address, Set<Long> phone,
			Vector<String> subject, Map<String, Double> marks, Properties qusAns, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.phone = phone;
		this.subject = subject;
		this.marks = marks;
		this.qusAns = qusAns;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getSalary() {
		return salary;
	}

	public void setSalary(List<Double> salary) {
		this.salary = salary;
	}

	public ArrayList<String> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}

	public Set<Long> getPhone() {
		return phone;
	}

	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}

	public Vector<String> getSubject() {
		return subject;
	}

	public void setSubject(Vector<String> subject) {
		this.subject = subject;
	}

	public Map<String, Double> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Double> marks) {
		this.marks = marks;
	}

	public Properties getQusAns() {
		return qusAns;
	}

	public void setQusAns(Properties qusAns) {
		this.qusAns = qusAns;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


}
