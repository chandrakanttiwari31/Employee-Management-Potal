package com.emp.service;

import java.util.List;

import com.emp.pojo.Employee;

public interface EmpService {

	List<Employee> loadAllEmployee();
	void saveEmployee(Employee employee);
	Employee getEmployee(int id);
	void update(Employee employee);
	void delete(int id);
}
