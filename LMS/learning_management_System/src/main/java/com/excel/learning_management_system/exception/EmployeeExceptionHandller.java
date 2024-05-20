package com.excel.learning_management_system.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandller {
	
		
		@ExceptionHandler(EmployeeException.class)
		public ResponseEntity<String> employeeNotFound(RuntimeException exp){
			return ResponseEntity.ok(exp.getMessage());
		}
	
	}
	
	

