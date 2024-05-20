package com.excel.learning_management_system.dto;

import java.time.LocalDate;

import com.excel.learning_management_system.enums.Designation;

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
public class EmployeeExperienceInfoDto {

	private Integer experienceId;
	private String companyName;
	private Double yearOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	private Designation designation;
	private String location;
}
