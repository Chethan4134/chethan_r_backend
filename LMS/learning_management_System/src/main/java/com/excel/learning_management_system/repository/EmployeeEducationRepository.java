package com.excel.learning_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.learning_management_system.entity.EmployeeEducationInfo;

public interface EmployeeEducationRepository extends JpaRepository<EmployeeEducationInfo, Integer> {

}
