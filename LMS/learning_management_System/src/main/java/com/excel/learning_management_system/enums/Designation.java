package com.excel.learning_management_system.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Designation {
	
	TRAINEE("TRAINEE"),
	MENTOR("MENTOR"),
	DEVELOPER("DEVELOPER"),
	TESTER("TESTER"),
	OTHERS("OTHERS");
	
	private final String designationType;
}
