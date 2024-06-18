package com.excel.freelance_finder.entity;

import java.time.LocalDate;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer messageId;
	private String content;
	private LocalDate sentAt;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private ClientUser clientUser;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Freelancer freelancer;
}
