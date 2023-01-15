package com.spring.core.entities;

import java.util.Arrays;

public class Course {
	private String[] course;

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String[] course) {
		super();
		this.course = course;
	}

	@Override
	public String toString() {
		return "Course [course=" + Arrays.toString(course) + "]";
	}

}
