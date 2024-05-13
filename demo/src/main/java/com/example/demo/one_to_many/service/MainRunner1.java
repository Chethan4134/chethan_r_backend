package com.example.demo.one_to_many.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.one_to_many.entity.Laptop;
import com.example.demo.one_to_many.entity.Student1;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner1 {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	public static void main(String[] args) {
		
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
		Student1 student1 =  new Student1();
		List<Laptop> laptops = new ArrayList<>();
		
		Laptop lap1 = new Laptop();
		Laptop lap2 = new Laptop();
		Laptop lap3 = new Laptop();
		
		lap1.setBrand("lenovo");
		lap1.setSerialNo("ABAOBOU76835CHB");
		lap1.setStudent1(student1);
		
		lap2.setBrand("dell");
		lap2.setSerialNo("AB72KJU76835CHB");
		lap2.setStudent1(student1);
		
		lap3.setBrand("hp");
		lap3.setSerialNo("AB65BOU76835CHB");
		lap3.setStudent1(student1);
		
		laptops.add(lap3);
		laptops.add(lap2);
		laptops.add(lap1);
		
		student1.setName("Chethan");
		student1.setAge(23);
		student1.setLaptop(laptops);
		
		transaction.begin();
		manager.persist(student1);
		transaction.commit();
				
	}
}
