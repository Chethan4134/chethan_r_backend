package com.excel.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.springboot.dto.EmployeeDto;
import com.excel.springboot.service.Implementation.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@PostMapping("/add")
	public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employee) {
		EmployeeDto insertEmployee = employeeServiceImpl.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(insertEmployee);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> getAllEmployee() {
		return ResponseEntity.ok(employeeServiceImpl.getAllEmployee());
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<EmployeeDto> getById(@PathVariable Integer id) {
		EmployeeDto employeeDto = employeeServiceImpl.getById(id);
		return ResponseEntity.status(HttpStatus.OK).body(employeeDto);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
		employeeServiceImpl.deleteById(id);
		return ResponseEntity.ok("Employee Data Successfully Deleted");
	}
	
	@PutMapping("/update")
	public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto dto) {
EmployeeDto	employeeDto=employeeServiceImpl.updateEmployee(dto);
		return ResponseEntity.status(HttpStatus.OK).body(employeeDto);
	}
}
