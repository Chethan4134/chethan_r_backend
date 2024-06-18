package com.excel.freelance_finder.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.freelance_finder.entity.Skills;

public interface SkillRepository extends JpaRepository<Skills, Integer> {

	Optional<Skills> findBySkillName(String skillName);
}
