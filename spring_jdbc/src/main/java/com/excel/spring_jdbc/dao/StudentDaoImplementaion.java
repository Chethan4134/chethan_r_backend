package com.excel.spring_jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.excel.spring_jdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImplementaion implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query = "insert into student1(id,name,city) values (?,?,?)";
		return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
	}
	@Override
	public List<Student> select() {
		String query = "select * from student1";
		List<Student> students = jdbcTemplate.query(query, new BeanPropertyRowMapper<Student>(Student.class));
		return students;
	}
	@Override
	public Map<String, Object> select(Student stu) {
		String query = "select * from student1 where id = ?";
		return jdbcTemplate.queryForMap(query, stu.getId());
	}
	@Override
	public int delete(Student stu) {
		String query = "delete from student1 where id = ?";
		return jdbcTemplate.update(query, stu.getId());
	}
	@Override
	public int update(Student stu) {
		String query = "update student1 set city = ? where id = ?";
		return jdbcTemplate.update(query, stu.getCity(),stu.getId());			
	}

}
