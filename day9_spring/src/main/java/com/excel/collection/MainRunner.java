package com.excel.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/collection/config.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
		System.out.println(emp.getPhones());
		System.out.println(emp.getSkills());
		System.out.println(emp.getName());
		System.out.println(emp.getNominees());
		
	}
}
