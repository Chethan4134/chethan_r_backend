package com.excel.day10sping_jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.excel.day10sping_jdbc.entity.Student1;

public class StudentDaoImp implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertOperaion(Student1 student) {
		String query = "insert into student(id,name,city) values (?,?,?)";
		return jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	}
	
}
