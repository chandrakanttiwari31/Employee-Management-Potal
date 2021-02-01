package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.AdminDao;
import com.emp.pojo.admin;

@Service
public class AdminServiceImpl implements AdminServiceDao {

	@Autowired
	AdminDao admindao;
	
	public void saveAdmin(admin a) {
		admindao.saveAdmin(a);

	}
	public List<admin> getAll()
	{
		List<admin> list=admindao.getAll();
		return list;
	}

}
