package com.excel.springboot.dto;

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
public class EmployeeDto {
	
	private Integer id;
	private String name;
	private String employeeNo;
	private String aadhar;
	private String email;
	private String pan;
	private String moblie;
	private String department;
}
