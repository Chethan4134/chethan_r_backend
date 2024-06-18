package com.excel.freelance_finder.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum Status {

	PENDING("PENDING"),
	ACCEPT("ACCEPT"),
	DECLINE("DECLINE");
	
	private final String applicationStatus;
}
