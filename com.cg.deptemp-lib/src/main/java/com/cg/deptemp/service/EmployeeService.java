package com.cg.deptemp.service;

import java.util.List;
import java.util.Optional;

import com.cg.deptemp.dto.EmployeeDto;
import com.cg.deptemp.entities.Department;
import com.cg.deptemp.entities.Employee;

public interface EmployeeService {
	int addEmployee(EmployeeDto empdto);
	List<Employee> viewAllEmps();
	  Optional<Employee> getEmpById(int empno);
		void deleteEmployee(int empno);
		
	

}
