package com.excel.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excel.springboot.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
