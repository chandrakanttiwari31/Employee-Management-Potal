package com.emp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.resource.HttpResource;

import com.emp.pojo.admin;
import com.emp.service.AdminServiceImpl;

@Controller
public class adminController {

	@Autowired
	AdminServiceImpl s;

	@GetMapping("/signup")
	public String showAdmin(Model model) {

		model.addAttribute("admin", new admin());
		return "signup";
	}

	// savelogin

	@PostMapping("/savelogin")
	public String savelogin(admin a) {
		System.out.println(a);
		s.saveAdmin(a);

		return "login";
	}

	@GetMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<admin> l = s.getAll();
		String uname = request.getParameter("uname");
		String password = request.getParameter("pass");

		if (uname != null) {
			for (int i = 0; i < l.size(); i++) {
				if (uname.equals(l.get(i).getUsername()) && password.equals(l.get(i).getPassword())) {
					HttpSession session = request.getSession();
					session.setAttribute("username", uname);
					return "redirect:/show";
				}

			}
		}
		return "login";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse respose)

	{
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
	}
}
