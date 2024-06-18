package com.excel.day10sping_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excel.day10sping_jdbc.dao.StudentDao;
import com.excel.day10sping_jdbc.entity.Student1;


public class App 
{
public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		StudentDao dao = context.getBean("studentDao",StudentDao.class);
		
		Student1 student = new Student1();
		student.setId(22);
		student.setName("Chethan");
		student.setCity("mysore");
		
		int result = dao.insertOperaion(student);
		System.out.println(result);
		
		
	}
}
