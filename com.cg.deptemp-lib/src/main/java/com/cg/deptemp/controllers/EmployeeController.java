package com.cg.deptemp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.deptemp.dto.EmployeeDto;
import com.cg.deptemp.entities.Employee;
import com.cg.deptemp.service.EmployeeServiceImp;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeServiceImp empservice;
	@PostMapping
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDto empdto){
		int empno = empservice.addEmployee(empdto);
		return new ResponseEntity<String>("inserted empcode = "+empno,HttpStatus.OK);
	}	
		@GetMapping
		public ResponseEntity<List<Employee>> viewAll(){
			List<Employee> emplist= empservice.viewAllEmps();
			return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);
			
	
	}
		@GetMapping("/id/{empno}")
		public ResponseEntity<Optional<Employee>> get(@PathVariable int empno){
			Optional<Employee> emp=empservice.getEmpById(empno);
			return new ResponseEntity<Optional<Employee>>(emp,HttpStatus.OK) ;
			
		}
		@DeleteMapping("/id/{empno}")
		public ResponseEntity<String> delete(@PathVariable int empno){
			empservice.deleteEmployee(empno);
			return new ResponseEntity<String>("deleted",HttpStatus.OK);
			
		}
}
