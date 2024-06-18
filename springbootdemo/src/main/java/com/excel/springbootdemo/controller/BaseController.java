package com.excel.springbootdemo.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excel.springbootdemo.dto.EmployeeDto;
import com.excel.springbootdemo.service.EmployeeService;





@RestController
public class BaseController {

//	@GetMapping("/home1")
//	public ResponseEntity<String> homeGetReq() {
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("hello");
//	}

//	@PostMapping("/home/{s}")
//	public ResponseEntity<String> homePostReq(@PathVariable String s, @RequestParam String str) {
//		return ResponseEntity.status(HttpStatus.OK).body(s + " " + str);
//	}

//	@PutMapping("/home2/{id}")
//	public ResponseEntity<String> putMethodName(@PathVariable String id) {
//		return ResponseEntity.status(HttpStatus.OK).body("efef");
//	}

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employee) {
		EmployeeDto dto = employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}

	
	@GetMapping("/fetch")
	public ResponseEntity<EmployeeDto> getMethodName( ) {
		return null;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestBody EmployeeDto employee){
		employeeService.delete(employee);
		return ResponseEntity.ok("Employee Deleted Successfully");
		
		
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
		return ResponseEntity.ok(employeeService.getAll());
	}
	
//	@GetMapping("/getById")
//	public ResponseEntity<String> getEmployeeById(@RequestBody EmployeeDto emp) {
//		employeeService.
//		return ResponseEntity.ok("Update Successfully");
//	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeeFirstName(@RequestBody EmployeeDto dto) {
		employeeService.updateFirstName(dto);
		return ResponseEntity.status(HttpStatus.OK).body(dto.getFirstName());
	}
	
}


