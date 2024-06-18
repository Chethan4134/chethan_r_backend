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
@Table(name = "message")
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int messageid;
	private int sender_id;
	private int reciver_id;
	private String content;
	private Date send_at;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserTable user3;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserTable user4;
	
	
	
}
