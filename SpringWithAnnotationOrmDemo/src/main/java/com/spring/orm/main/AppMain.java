package com.spring.orm.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.configuration.HibernateConfiguration;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.model.Student;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
		StudentDao studentDao = context.getBean(StudentDao.class);
		System.out.println(studentDao);
		
		Student st1 = new Student("Vikas Kumar","Ropar");
		Student st2 = new Student("Omi Verma","Prem Nagar");
		Student st3 = new Student("Amit Kumar","Uk");
		Student st4 = new Student("Chandan Kumar","Asron");
		Student st5 = new Student("Rahul Kumar","Rail");
		
		studentDao.insert(st1);
		studentDao.insert(st2);
		studentDao.insert(st3);
		studentDao.insert(st4);
		studentDao.insert(st4);
		
		Student std = studentDao.getStudentById(5);
		System.out.println(std.getStudentId()+" "+std.getStudentName()+" "+std.getStudentCity());
		
	    studentDao.update(5);
	    studentDao.deleteStudent(10);
	    
	    List<Student> students = studentDao.getAllStudent();
	    students.forEach(e->System.out.println(e.getStudentId()+" "+e.getStudentName()+" "+e.getStudentCity()));
	}
}
