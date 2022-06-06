package com.java.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.springboot.model.Employee;
import com.java.springboot.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	

}
