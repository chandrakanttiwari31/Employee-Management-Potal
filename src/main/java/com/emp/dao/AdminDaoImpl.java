package com.emp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.emp.pojo.Employee;
import com.emp.pojo.admin;
import com.java.rowmapper.adminmapper;
import com.java.rowmapper.emprowmapper;

@Repository
public class AdminDaoImpl implements AdminDao {


	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void saveAdmin(admin a) {
		Object[] sql={
				a.getUsername(),
				a.getPassword()};
		String query="insert into admin(username,password) values(?,?)";
		
		jdbcTemplate.update(query,sql);
		System.out.println("1 record inserted");
	}

	
	
	public List<admin> getAll() {
		String sql = "select * from admin";
		List<admin> list = jdbcTemplate.query(sql, new adminmapper());

		return list;
	}
	
	
	
}

	 
			
