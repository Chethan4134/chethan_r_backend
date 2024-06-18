package com.excel.day10_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excel.day10_spring.dao.StudentDao;
import com.excel.day10_spring.entities.Student;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		StudentDao dao = context.getBean("studentDao",StudentDao.class);
		
		Student student = new Student();
		student.setId(22);
		student.setName("Chethan");
		student.setCity("mysore");
		
		int result = dao.insertOperaion(student);
		System.out.println(result);
		
		
	}
}
