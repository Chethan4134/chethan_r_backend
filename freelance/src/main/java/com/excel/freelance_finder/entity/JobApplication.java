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
@Table(name = "jobapplication")
public class JobApplication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicationid;
	private int job_id;
	private int freelancer_id;
	private String status;
	private Date applied_at;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private JobPost jobpost1;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserTable user2;
}
