package com.excel.learning_management_system.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MaritalStatus {
	
	MARRIED("MARRIED"),
	UN_MARRIED("UNMARRIED"),
	DIVORCED("DIVORCED");
	
	private final String maritalStatus;
}
