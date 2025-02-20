package com.excel.learning_management_system.dto;

import java.time.LocalDate;

import com.excel.learning_management_system.enums.Designation;
import com.excel.learning_management_system.enums.EmployeeStatus;
import com.excel.learning_management_system.enums.Gender;

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
public class EmployeePrimaryInfoDto {
	
	private Integer id;
	private String employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	private LocalDate dateOfBirth;
	private String email;
	private String bloodGroup;
	private Designation designation;
	private Gender gender;
	private String nationality;
	private EmployeeStatus employeeStatus;
}
