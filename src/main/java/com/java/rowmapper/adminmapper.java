package com.java.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.emp.pojo.admin;

public class adminmapper implements RowMapper<admin> {
	
	public admin mapRow(ResultSet rs,int rowNum) throws SQLException{
	
	admin a=new admin();
	
	a.setUsername(rs.getString("username"));
	a.setPassword(rs.getString("password"));
	return a;
	}

}
