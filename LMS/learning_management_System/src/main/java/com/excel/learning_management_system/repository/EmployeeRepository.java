package com.excel.learning_management_system.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.learning_management_system.entity.EmployeePrimaryInfo;

public interface EmployeeRepository extends JpaRepository<EmployeePrimaryInfo, Integer> {

	Optional<EmployeePrimaryInfo> findByEmployeeId(String employeeId);

	
	
}
