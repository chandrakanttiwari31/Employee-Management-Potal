package com.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class newController {

	@GetMapping("/")
	public String getIndex()
	{
		
		return "index";
	}
	
}
