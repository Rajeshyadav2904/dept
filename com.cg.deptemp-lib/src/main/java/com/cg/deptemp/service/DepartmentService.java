package com.cg.deptemp.service;
import java.util.List;
import java.util.Optional;

import com.cg.deptemp.entities.*;

public interface DepartmentService {
	void addDepartment(Department dept);
	void updateDepartment(Department dept);
	List<Department> viewAlldepts();
     Optional<Department> getDeptById(int deptno);
	void deleteDepartment(int deptno);
	
}
