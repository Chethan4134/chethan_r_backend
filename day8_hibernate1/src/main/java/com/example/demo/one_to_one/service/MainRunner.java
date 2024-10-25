package com.example.demo.one_to_one.service;

import com.example.demo.one_to_one.entity.MarksCard;
import com.example.demo.one_to_one.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		MarksCard card = new MarksCard();
		card.setGrade("A");
		card.setMarks(90.0);

		Student st = new Student();
		st.setName("Chethan");
		st.setAge(23);
		st.setMarks_card_id(card);
		card.setStudent(st);
		st.setMarks_card_id(card);

		transaction.begin();
		manager.persist(st);
		transaction.commit();

		manager.close();

	}
}
