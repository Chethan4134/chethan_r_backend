package com.excel.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/collection/config.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		System.err.println(emp);
		System.out.println(emp.getPhones());
		
	}
}
