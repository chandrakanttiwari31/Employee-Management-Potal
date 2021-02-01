package com.emp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.emp.pojo.Employee;

import com.java.rowmapper.emprowmapper;



@Repository
public class EmpDaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Employee> loadAllEmployee() {
		String sql = "select * from employees";
		List<Employee> studentData = jdbcTemplate.query(sql, new emprowmapper());

		return studentData;
	}

	public void saveEmployee(Employee employee) {
		 Object[] sql={
				 employee.getName(),
				 employee.getEmail(),
				 employee.getAddress(),
				 employee.getSalary()};
			 
			 
					String query="insert into employees(name,email,address,salary) values(?,?,?,?)";
					
					jdbcTemplate.update(query,sql);
					System.out.println("1 record inserted");

	}

	public Employee getEmployee(int id) {
		String sql="select * from employees where id=?";
		Employee student=jdbcTemplate.queryForObject(sql, new emprowmapper(),id);
		return student;
	}

	public void update(Employee employee) {
		String sql="update employees set name=?,email=?,address=?,salary=? where id=?";
		jdbcTemplate.update(sql,employee.getName(),employee.getEmail(),employee.getAddress(),employee.getSalary(),employee.getId());
		System.out.println("1 record updated");

	}

	public void delete(int id) {
		String sql="delete from employees where id=?";
		jdbcTemplate.update(sql, id);


	}

}
