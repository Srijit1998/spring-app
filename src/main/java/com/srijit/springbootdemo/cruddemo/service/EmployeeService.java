package com.srijit.springbootdemo.cruddemo.service;

import java.util.List;

import com.srijit.springbootdemo.cruddemo.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	Employee findById(int id);
	void save(Employee employee);
	void deleteById(int id);
}
