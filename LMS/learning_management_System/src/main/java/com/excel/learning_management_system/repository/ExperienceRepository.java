package com.excel.learning_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.learning_management_system.entity.EmployeeExperienceInfo;

public interface ExperienceRepository extends JpaRepository<EmployeeExperienceInfo, Integer> {

}