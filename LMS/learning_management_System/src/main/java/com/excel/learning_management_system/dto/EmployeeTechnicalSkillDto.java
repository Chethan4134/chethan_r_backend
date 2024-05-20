package com.excel.learning_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeTechnicalSkillDto {

	private String employeeId;
	private Integer technicalkId;
	private String skillType;
	private String skillRating;
	private Double yearOfExperience;
	
}