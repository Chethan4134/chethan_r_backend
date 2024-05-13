package com.excel.freelance_finder.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "user")
public class UserTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String username;
	private String email;
	private boolean freelancer;
	private String bio;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Skills> skill;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user_id")
	private Notification notification;
	
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user_id")
//	private Notification notification;
	
	@OneToOne(cascade = CascadeType.ALL)
	private JobPost jobpost1;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user2")
	private JobApplication job1;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user3")
	private Message message;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user4")
	private Message message1;
	

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user6")
	private Project project;
	

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user7")
	private Project project1;
	
	
}
