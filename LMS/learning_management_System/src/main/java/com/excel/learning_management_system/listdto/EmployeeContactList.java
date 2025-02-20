package com.excel.learning_management_system.listdto;

import java.util.List;

import com.excel.learning_management_system.dto.EmployeeContactInfoDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeContactList {

	private String employeeId;
	
	private List<EmployeeContactInfoDto> contactList;
}
