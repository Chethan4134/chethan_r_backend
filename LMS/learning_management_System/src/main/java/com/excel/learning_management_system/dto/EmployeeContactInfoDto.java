package com.excel.learning_management_system.dto;

import com.excel.learning_management_system.enums.ContactType;

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
public class EmployeeContactInfoDto {

	private Integer contactId;
	private ContactType contactType;
	private Long contactNumber;
}
