package com.springmicroservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmicroservices.entities.Department;
import com.springmicroservices.repository.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo departrepository;

	public Department saveDepartment(Department department) {
	
		return departrepository.save(department);
	}

	public Department findByDepartment(Long id) {
		
		return departrepository.findByDepartmentid(id);
	}

	public DepartmentRepo getDepartrepository() {
		return departrepository;
	}

	public void setDepartrepository(DepartmentRepo departrepository) {
		this.departrepository = departrepository;
	}
}
