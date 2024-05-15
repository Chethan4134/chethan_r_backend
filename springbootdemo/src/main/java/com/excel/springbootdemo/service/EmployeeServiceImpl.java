package com.excel.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.springbootdemo.EmployeeConstant;
import com.excel.springbootdemo.dto.EmployeeDto;
import com.excel.springbootdemo.entity.Employee;
import com.excel.springbootdemo.exception.EmployeeNotFound;
import com.excel.springbootdemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	List<Employee> emp = new ArrayList<>();
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
	Employee employee = Employee.builder()
			.firstName(dto.getFirstName())
			.lastName(dto.getLastName())
			.mobileNo(dto.getMobileNo())
			.aadharNo(dto.getAadharNo())
			.panNo(dto.getPanNo())
			.employeeNo(dto.getEmployeeNo())
			.build();
	employee.setId((int)(Math.random()*100));
	emp.add(employee);

	Employee save = employeeRepository.save(employee);
	
		return EmployeeDto.builder()
				.id(save.getId())
				.firstName(save.getFirstName())
				.lastName(save.getLastName())
				.mobileNo(save.getMobileNo())
				.aadharNo(save.getAadharNo())
				.panNo(save.getPanNo())
				.employeeNo(save.getEmployeeNo())
				.build();
	}


	@Override
	public void delete(EmployeeDto dto) {
	Optional<Employee> optional=employeeRepository.findById(dto.getId());
	if(optional.isPresent())
		employeeRepository.delete(optional.get());
	else 
		throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_NOT_FOUND) ;
	}

	@Override
	public List<EmployeeDto> getAll() {
		return employeeRepository
				.findAll().stream()
				.map(e -> EmployeeDto.builder()
						.id(e.getId())
						.aadharNo(e.getAadharNo())
						.firstName(e.getFirstName())
						.lastName(e.getLastName())
						.employeeNo(e.getEmployeeNo())
						.panNo(e.getPanNo())
						.mobileNo(e.getMobileNo())
						.build()).toList();
	}


//	@Override
//	public void byId(EmployeeDto dto) {
//		Optional<Employee> optional = employeeRepository.findById(dto.getId());
//		if(optional.isPresent())
//			employeeRepository.
		
//	}
	
	
}
