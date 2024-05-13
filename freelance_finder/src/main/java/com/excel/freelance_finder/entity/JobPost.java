package com.excel.freelance_finder.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "jobpost")
public class JobPost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int job_id;
	private int clint_id;
	private String title;
	private String skill_required;
	private double packages;
	private String companyname;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "jobpost1")
	private UserTable user1;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "jobpost1")
	private JobApplication jobapply;
}
