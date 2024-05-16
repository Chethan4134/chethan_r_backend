package com.excel.springboot.service;

import java.util.List;

import com.excel.springboot.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto addEmployee(EmployeeDto dto);

	List<EmployeeDto> getAllEmployee();

	EmployeeDto getById(Integer id);

	void deleteById(Integer dto);
	
	EmployeeDto updateEmployee(EmployeeDto dto);
}
