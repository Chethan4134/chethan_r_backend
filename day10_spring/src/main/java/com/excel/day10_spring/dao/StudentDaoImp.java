package com.excel.day10_spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.excel.day10_spring.entities.Student;

@Component("studentDao")
public  class StudentDaoImp implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertOperaion(Student student) {
		String query = "insert into student(id,name,city) values (?,?,?)";
		return jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	}
	
	
}
