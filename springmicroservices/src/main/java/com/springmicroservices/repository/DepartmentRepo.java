package com.springmicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmicroservices.entities.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

	Department findByDepartmentid(Long id);

}
