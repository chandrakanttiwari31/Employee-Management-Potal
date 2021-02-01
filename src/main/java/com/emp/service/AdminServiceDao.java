package com.emp.service;

import java.util.List;

import com.emp.pojo.admin;

public interface AdminServiceDao {
	void saveAdmin(admin a);
	 List<admin> getAll();
}
