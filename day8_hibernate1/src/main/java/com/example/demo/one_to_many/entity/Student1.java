package com.example.demo.one_to_many.entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student1")


public class Student1 {
	
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "stdent_id")
	private int id;
	
	@Column(name = "stdent_name")
	private String name;
	
	@Column(name = "stdent_age")
	private int age;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student1")
	private List<Laptop> laptop;
}
