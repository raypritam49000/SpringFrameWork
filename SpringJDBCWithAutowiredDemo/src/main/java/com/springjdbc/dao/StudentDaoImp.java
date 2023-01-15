package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.model.Student;

@Component("studentDao")
public class StudentDaoImp implements StudentDao {
	@Autowired
	private JdbcTemplate template;

	@Override
	public int insert(Student student) {
		String query = "insert into student values(?,?,?)";
		int result = this.template.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	@Override
	public int change(Student student) {
		String query = "update student set name=?,city = ? where id = ?";
		int result = this.template.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	@Override
	public int delete(int studentId) {
		String query = "delete from student where id = ? ";
		int result = this.template.update(query, studentId);
		return result;
	}

	@Override
	public Student getStudent(int studentId) {
		String query = "select * from student where id = ?";
		// RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.template.queryForObject(query, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setCity(rs.getString("city"));

				return student;
			}

		}, studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> list = this.template.query(query, new RowMapperImpl());
		return list;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

}
