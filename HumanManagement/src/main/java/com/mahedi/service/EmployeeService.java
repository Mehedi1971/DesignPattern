package com.mahedi.service;

import java.util.List;

import com.mahedi.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeByID(long id);
}
