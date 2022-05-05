package com.tns.repository;

import java.util.*;

import com.tns.entity.Employee;

@SuppressWarnings("unused")
public interface IEmployeeRepository {

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	Employee searchEmployee(int id);

	boolean deleteEmployee(int id);

	void beginTransaction();

	void commitTransaction();

}