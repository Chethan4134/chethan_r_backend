package com.excel.learning_management_system.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AddressType {
	
	PERMANENT("PERMANENT"),
	TEMPORARY("TEMPORARY");
	
	private final String addressType;
}
