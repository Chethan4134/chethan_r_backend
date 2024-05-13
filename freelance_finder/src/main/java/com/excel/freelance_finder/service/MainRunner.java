package com.excel.freelance_finder.service;

import java.util.ArrayList;
import java.util.List;

import com.excel.freelance_finder.entity.Notification;
import com.excel.freelance_finder.entity.Skills;
import com.excel.freelance_finder.entity.UserTable;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void main(String[] args) {

		factory = Persistence.createEntityManagerFactory("freelance");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		UserTable user = new UserTable();
		Notification note = new Notification();
		
	
		
		transaction.begin();
		manager.persist(user);
		transaction.commit();
	}

}
