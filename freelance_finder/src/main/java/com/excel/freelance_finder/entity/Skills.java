package com.excel.freelance_finder.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillID;
	private String skillName;

	@JoinTable(name = "freelancer_skills", joinColumns = @JoinColumn(name = "freelancer_id"),inverseJoinColumns = @JoinColumn(name ="skill_id"))
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Freelancer> freelancers;
}
