package com.excel.springbootdemo.exception;

public class EmployeeNotFound extends RuntimeException {
	
	private static final long serialVersionUID = 1l;
	
	public EmployeeNotFound(String message) {
		super(message);
	}
}
