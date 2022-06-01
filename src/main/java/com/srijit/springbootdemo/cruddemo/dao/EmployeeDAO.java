package com.srijit.springbootdemo.cruddemo.dao;

import java.util.List;

import com.srijit.springbootdemo.cruddemo.entity.Employee;

public interface EmployeeDAO {
	List<Employee> findAll();
	Employee findById(int id);
	void save(Employee employee);
	void deleteById(int id);
}
