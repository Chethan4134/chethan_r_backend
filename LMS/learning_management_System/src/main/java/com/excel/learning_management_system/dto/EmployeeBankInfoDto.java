package com.excel.learning_management_system.dto;

import com.excel.learning_management_system.enums.AccountType;

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
public class EmployeeBankInfoDto {
	
	private String employeeId;
	private Integer bankId;
	private Long accountNo;
	private String bankName;
	private AccountType accountType;
	private String ifscCode;
	private String branch;
	private String state;
	
}
