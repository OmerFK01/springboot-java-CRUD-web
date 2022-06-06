package com.java.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	
}
