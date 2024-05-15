package com.excel.spring_jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excel.spring_jdbc.dao.StudentDao;
import com.excel.spring_jdbc.entity.Student;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao dao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 To Insert a Record");
		System.out.println("Enter 2 To Update a Record");
		System.out.println("Enter 3 To Delete a Record");
		System.out.println("Enter 4 To SelectId a Record");
		System.out.println("Enter 5 To SelectAll a Record");
		System.out.println("======================================");
		int num = sc.nextInt();

		switch (num) {
		case 1: {
			System.out.println("Enter Student Id");
			int id = sc.nextInt();
			student.setId(id);
			System.out.println("Enter Student Nane");
			String name = sc.next();
			student.setName(name);
			System.out.println("Enter Student Location");
			String city = sc.next();
			student.setCity(city);
			int res = dao.insert(student);
			if (res != 0) {
				System.out.println("Inserted Successfully");
			} else {
				System.out.println("Insertion Failed");
			}

		}
			break;
		case 2: {
			System.out.println("Enter the Id To  Update a Record");
			int id = sc.nextInt();
			student.setId(id);
			System.out.println("Change the Student Location");
			String city = sc.next();
			student.setCity(city);
			int res = dao.update(student);
			if (res != 0) {
				System.out.println("Update Successfully");
			} else {
				System.out.println("Failed To Update");
			}

		}
			break;
		case 3: {
			System.out.println("Enter the Id To  Delete a Record");
			int id = sc.nextInt();
			student.setId(id);
			int res = dao.delete(student);
			if (res != 0) {
				System.out.println("Successfully Deleted the Student Record");
			} else {
				System.out.println("Student Record not Deleted");
			}
		}
			break;

		case 4: {
			System.out.println("Enter the Id To  Delete a Record");
			int id = sc.nextInt();
			student.setId(id);
			System.out.println(dao.select(student));
		}
			break;
		case 5: {
			System.out.println(dao.select());
		}
			break;
		default:
			System.out.println("Enter Correct one!...");
			break;
		}
		sc.close();

	}
}
