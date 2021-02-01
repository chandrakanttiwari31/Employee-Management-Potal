package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.EmployeeDao;
import com.emp.pojo.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmployeeDao empdao;
	
	public List<Employee> loadAllEmployee() {
		List<Employee> s=empdao.loadAllEmployee();
		return s;
	}

	public void saveEmployee(Employee employee) {
		empdao.saveEmployee(employee);

	}

	public Employee getEmployee(int id) {
		Employee student=empdao.getEmployee(id);
		return student;
	}

	public void update(Employee employee) {
		
		empdao.update(employee);

	}

	public void delete(int id) {
		empdao.delete(id);

	}

}
