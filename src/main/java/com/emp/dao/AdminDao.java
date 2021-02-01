package com.emp.dao;

import java.util.List;

import com.emp.pojo.admin;


public interface AdminDao {
	
	void saveAdmin(admin a); List<admin> getAll();
   
    
    //boolean adminLogin(String username, String password);
}
