package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll(); //get
	
	public Employee findById(int theId); //get
	
	public void save(Employee theEmployee); //post
	
	public void deleteById(int theId); //delete
	
}
