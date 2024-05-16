package com.excel.learning_management_system.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EducationType {
	
	POST_GRADUATE("POST_GRADUATE"),
	UNDER_GRADUATE("UNDER_GRADUATE"),
	OTHER("OTHER");
	
	private final String educationType;
}
