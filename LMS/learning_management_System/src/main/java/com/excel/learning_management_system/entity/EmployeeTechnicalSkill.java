package com.excel.learning_management_system.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_technical_info")
@Builder
public class EmployeeTechnicalSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer technicalkId;
	private String skillType;
	private String skillRating;
	private Double yearOfExperience;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<EmployeePrimaryInfo> employee;
}
