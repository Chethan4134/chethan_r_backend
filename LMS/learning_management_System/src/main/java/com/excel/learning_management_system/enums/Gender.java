package com.excel.learning_management_system.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Gender {
			
	MALE("MALE"),
	FEMALE("FEMALE"),
	OTHER("OTHER");
	
	private final String genderType;
}
