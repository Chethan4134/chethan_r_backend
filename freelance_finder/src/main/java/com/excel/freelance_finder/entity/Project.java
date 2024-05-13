package com.excel.freelance_finder.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
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
@Table(name = "project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_id;
	private int client_id;
	private int freelancer_id;
	private int project_title;
	private String status;
	private Date strat_date;
	private Date deadline;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserTable user6;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserTable user7;
	

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "project2")
	private ProjectTask project_task;
	
	
}
