package com.excel.springbootdemo.service;

import java.util.List;

import com.excel.springbootdemo.dto.EmployeeDto;

public interface EmployeeService {
	
	public EmployeeDto addEmployee(EmployeeDto dto);
	
	public void delete(EmployeeDto dto);
	
	public List<EmployeeDto> getAll();
	
//	public void byId(EmployeeDto dto); 
	
	public EmployeeDto updateFirstName(EmployeeDto dto);
		

}
