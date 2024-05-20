package com.excel.learning_management_system.dto;


import com.excel.learning_management_system.enums.EducationType;

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
public class EmployeeEducationInfoDto {
	
	private Integer educationId;
	private EducationType educationType;
	private Integer yearOfPassing;
	private Double percentage;
	private String instituteName;
	private String univercityName;
	private String specialization;
	private String state;
}