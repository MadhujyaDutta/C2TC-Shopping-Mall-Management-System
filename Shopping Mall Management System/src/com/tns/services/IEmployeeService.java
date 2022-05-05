package com.tns.services;


import java.util.List;

import com.tns.entity.Employee;

public interface IEmployeeService {

	Employee addEmployee(Employee employee);
	
	List<Employee> addEmployees(List<Employee> employees);

	Employee updateEmployee(Employee employee);

	Employee searchEmployee(int id);

	boolean deleteEmployee(int id);
}