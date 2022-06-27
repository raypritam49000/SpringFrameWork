package com.springjdbc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.model.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program Started.....");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
		
//		Student st = new Student(464,"Omi Verma","Ropar");
//		
//		int rs = studentDao.insert(st);
//		System.out.println("Student added "+rs);
		
//		Student st1 = new Student(464,"JP Verma","Sampura");
//		int res = studentDao.change(st1);
//		System.out.println("Update Student "+res);
		
//		int delete = studentDao.delete(124);
//		System.out.println("Delete Student "+delete);
		
		Student student = studentDao.getStudent(464);
		System.out.println(student.getName()+" "+student.getCity());
		
		List<Student> allStudents = studentDao.getAllStudents();
		allStudents.forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getCity()));
		
//		JdbcTemplate template = context.getBean("jdbcTemplete", JdbcTemplate.class);
//
//		// insert query
//		String query = "insert into student values(153,'Rahul Kumar','Prem Nagar')";
//
//		// fire query
//		int result = template.update(query);
//		System.out.println("number of recored inserted " + result);
//
//		String query1 = "insert into student values(?,?,?)";
//
//		// fire query
//		int result1 = template.update(query1, 194, "Suraj Mehta", "Rail");
//		System.out.println("number of recored inserted " + result1);
//		System.out.println("-------Successfully-------");
	}
}
