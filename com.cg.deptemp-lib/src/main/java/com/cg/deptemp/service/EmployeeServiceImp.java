package com.cg.deptemp.service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.deptemp.dto.EmployeeDto;
import com.cg.deptemp.entities.Department;
import com.cg.deptemp.entities.Employee;
import com.cg.deptemp.repository.DepartmentRepository;
import com.cg.deptemp.repository.EmployeeRepository;

@Service
public  class EmployeeServiceImp implements EmployeeService{

	@Autowired
	EmployeeRepository emprepo;
	@Autowired
	DepartmentRepository deptrepo;

	@Override
	public int addEmployee(EmployeeDto empdto) {
		
		  Department dept = deptrepo.getDeptById(empdto.getDeptno());
		  Employee emp = new Employee();
		  emp.setEmpname(empdto.getEmpname());
		  emp.setJob(empdto.getJob());
		  emp.setDoj(empdto.getDoj());
		  emp.setSalary(empdto.getSalary());
		  emp.setDept(dept);
		  emprepo.save(emp);
		 return emp.getEmpno();
	}

	@Override
	public List<Employee> viewAllEmps() {
		
		return emprepo.findAll();
	}

	@Override
	public Optional<Employee> getEmpById(int empno) {
		 
		Optional<Employee> emp=emprepo.findById(empno);
		return emp;
	}

	@Override
	public void deleteEmployee(int empno) {
		// TODO Auto-generated method stub
		emprepo.deleteById(empno);
	}
	
}
