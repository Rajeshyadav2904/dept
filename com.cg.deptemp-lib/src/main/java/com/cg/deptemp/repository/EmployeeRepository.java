package com.cg.deptemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.deptemp.entities.Department;
import com.cg.deptemp.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
}

