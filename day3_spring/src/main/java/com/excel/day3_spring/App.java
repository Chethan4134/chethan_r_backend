package com.excel.day3_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/day3_spring/config.xml");

		Student std = (Student) context.getBean("student");
		Student std1 = (Student) context.getBean("student1");
		Student std2 = (Student) context.getBean("student2");
		System.out.println(std2);
		System.out.println(std);
		System.out.println(std1);
	
	}
}
