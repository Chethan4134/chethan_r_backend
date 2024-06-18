package com.example.demo.manytomany.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.manytomany.entity.Books;
import com.example.demo.manytomany.entity.Student2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner3 {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	public static void main(String[] args) {
		
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
		List<Student2> st = new ArrayList<>();
		
		Student2 st1 = new Student2();
		Student2 st2 = new Student2();
		Student2 st3 = new Student2();
		
		List<Books> b = new ArrayList<>();
		
		Books b1 = new Books();
		Books b2 = new Books();
		Books b3 = new Books();
		
		
		st1.setName("chethan");
		st2.setName("Akash");
		st3.setName("Sachin");
		
		st.add(st3);
		st.add(st2);
		st.add(st1);
		
		b1.setName("Java");
		b2.setName("JavaScript");
		b3.setName("React");
		
		b.add(b3);
		b.add(b2);
		b.add(b1);
		
		st1.setBook(b);
		st2.setBook(b);
		st3.setBook(b);
		
		b1.setStudent(st);
		b2.setStudent(st);
		b3.setStudent(st);
		
		
		
		transaction.begin();
		manager.persist(b1);
		transaction.commit();
				
	}
}
