package com.java.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.emp.pojo.Employee;


public class emprowmapper 	implements RowMapper<Employee> {

		public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{
			
			Employee s=new Employee();
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setEmail(rs.getString("email"));
			
			s.setAddress(rs.getString("address"));
			s.setSalary(rs.getLong("salary"));
			
			return s;
		}
		
}
