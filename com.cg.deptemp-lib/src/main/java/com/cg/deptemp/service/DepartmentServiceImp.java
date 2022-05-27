package com.cg.deptemp.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.deptemp.entities.*;
import com.cg.deptemp.repository.*;
@Service
public  class DepartmentServiceImp implements DepartmentService{
	@Autowired
	DepartmentRepository deptrepo;
	@Override
	public void addDepartment(Department dept) {
		// TODO Auto-generated method stub
		deptrepo.save(dept);
	}
	@Override
	public void updateDepartment(Department dept) {
		// TODO Auto-generated method stub
		deptrepo.save(dept);
	}
	@Override
	public List<Department> viewAlldepts() {
		
		return deptrepo.findAll();
	}
	@Override
	public Optional<Department> getDeptById(int deptno) {
		// TODO Auto-generated method stub
		Optional<Department> dept = deptrepo.findById(deptno);
		return dept;
	}
	@Override
	public void deleteDepartment(int deptno) {
		deptrepo.deleteById(deptno);
		
	}

}
