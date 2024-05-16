package com.excel.springboot.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class EmployeeExceptionHandel {
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> employeeNotFound(RuntimeException exp){
		return ResponseEntity.ok(exp.getMessage());
	}
}
