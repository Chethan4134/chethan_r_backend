package com.example.demo.one_to_one.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "stdent_id")
	private int id;
	
	@Column(name = "stdent_name")
	private String name;
	
	@Column(name = "stdent_age")
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MarksCard marks_card_id;
	
	
}
