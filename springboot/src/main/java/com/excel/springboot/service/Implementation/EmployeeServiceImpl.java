package com.excel.springboot.service.Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.springboot.constant.EmployeeConstant;
import com.excel.springboot.dto.EmployeeDto;
import com.excel.springboot.entity.Employee;
import com.excel.springboot.exception.EmployeeNotFound;
import com.excel.springboot.repository.EmployeeRepository;
import com.excel.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {

		Employee employee = Employee.builder()
				.id(dto.getId())
				.name(dto.getName())
				.employeeNo(dto.getEmployeeNo())
				.aadhar(dto.getAadhar())
				.email(dto.getEmail())
				.pan(dto.getPan())
				.moblie(dto.getMoblie())
				.department(dto.getDepartment())
				.build();

		Employee save = employeeRepository.save(employee);

		return EmployeeDto.builder()
				.id(save.getId())
				.name(save.getName())
				.employeeNo(save.getEmployeeNo())
				.aadhar(save.getAadhar())
				.email(save.getEmail())
				.pan(save.getPan())
				.moblie(save.getMoblie())
				.department(save.getDepartment())
				.build();
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		return employeeRepository.findAll().stream()
				.map(e -> EmployeeDto.builder()
						.id(e.getId())
						.name(e.getName())
						.employeeNo(e.getEmployeeNo())
						.aadhar(e.getAadhar())
						.email(e.getEmail())
						.pan(e.getPan())
						.moblie(e.getMoblie())
						.department(e.getDepartment())
						.build())
						.toList();
	}

	@Override
	public EmployeeDto getById(Integer id) {
		Optional<Employee> optional = employeeRepository.findById(id);

		if (optional.isPresent()) {
			Employee employee = optional.get();
			return EmployeeDto.builder()
					.id(employee.getId())
					.name(employee.getName())
					.employeeNo(employee.getEmployeeNo())
					.aadhar(employee.getAadhar())
					.email(employee.getEmail())
					.pan(employee.getPan())
					.moblie(employee.getMoblie())
					.department(employee.getDepartment())
					.build();
		} else
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_ID);
	}

	@Override
	public void deleteById(Integer id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isPresent()) {
			employeeRepository.delete(optional.get());
		} else
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_ID);
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto dto) {
		Optional<Employee> optional = employeeRepository.findById(dto.getId());
		if(optional.isPresent()) {
			Employee employee = optional.get();
			employee.setDepartment(dto.getDepartment());
			employee.setMoblie(dto.getMoblie());
			employee.setEmail(dto.getEmail());
			
			Employee save = employeeRepository.save(employee);
			return EmployeeDto.builder()
					.id(save.getId())
					.name(save.getName())
					.employeeNo(save.getEmployeeNo())
					.aadhar(save.getAadhar())
					.email(save.getEmail())
					.pan(save.getPan())
					.moblie(save.getMoblie())
					.department(save.getDepartment())
					.build();
		}
		else {
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_ID);
		}
	}

	
}
