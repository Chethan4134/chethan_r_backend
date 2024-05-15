package com.excel.spring_jdbc.dao;

import java.util.List;
import java.util.Map;

import com.excel.spring_jdbc.entity.Student;

public interface StudentDao {


	int insert(Student student);
	public List<Student> select();

	public Map<String, Object> select(Student stu);


	public int delete(Student stu);

	public int update(Student stu);



}
