package com.emp.dao;

import java.util.List;

import com.emp.pojo.Employee;


public interface EmployeeDao {

	List<Employee> loadAllEmployee();
	void saveEmployee(Employee employee);
	Employee getEmployee(int id);
	void update(Employee employee);
	void delete(int id);
	
	
}
