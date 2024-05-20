package com.excel.learning_management_system.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.learning_management_system.entity.EmployeeTechnicalSkill;

public interface EmployeeSkillRepository extends JpaRepository<EmployeeTechnicalSkill, Integer> {

	Optional<EmployeeTechnicalSkill> findBySkillTypeAndSkillRatingAndYearOfExperience(String skillType,String skillRating,Double yearOfExperience);
}
