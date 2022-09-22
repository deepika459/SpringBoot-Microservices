package com.springmicroservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springmicroservices.entities.Department;
import com.springmicroservices.service.DepartmentService;

@RestController
@RequestMapping("/department")
@EnableEurekaClient
public class DepartmentController {

	@Autowired
	private DepartmentService departservice;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return departservice.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findByDepartment(@PathVariable("id") Long id) {
		return departservice.findByDepartment(id);
		
	}

	public DepartmentService getDepartservice() {
		return departservice;
	}

	public void setDepartservice(DepartmentService departservice) {
		this.departservice = departservice;
	}
}
