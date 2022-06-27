package com.spring.orm.dao;

import java.io.Serializable;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.model.Student;

@Transactional
public class StudentDao implements Serializable {

	private HibernateTemplate hibernateTemplate;

	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	public void update(int studentId) {
		Student st = this.hibernateTemplate.get(Student.class,studentId);
		if(st!=null) {
			st.setStudentCity("Chandigrah");
			st.setStudentName("Suraj Mehta");
		}
		this.hibernateTemplate.update(st);
	}
	
	public List<Student> getAllStudent() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	public void deleteStudent(int studentId) {
		Student st = this.hibernateTemplate.get(Student.class,studentId);
		if(st!=null) {
			this.hibernateTemplate.delete(st);
		}
	}
	
	public Student getStudentById(int studentId) {
		Student st = this.hibernateTemplate.get(Student.class,studentId);
		return st;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
