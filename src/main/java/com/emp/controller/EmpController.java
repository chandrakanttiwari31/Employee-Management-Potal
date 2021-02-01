package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.emp.pojo.Employee;
import com.emp.service.EmpServiceImpl;

@Controller
public class EmpController {

	@Autowired
	EmpServiceImpl empservice;

	@GetMapping("/show")
	public String showEmployee(Model model) {
		List<Employee> s = empservice.loadAllEmployee();

		model.addAttribute("employees", s);
		return "employeelist";

	}

	@GetMapping("/showaddEmployee")
	public String showAddEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employees", employee);

		return "addemp";

	}

	// saveStudent

	@PostMapping("/saveEmployee")
	public String AddStudent(Employee employee) {

		if (employee.getId() == 0) { // insert
			empservice.saveEmployee(employee);
		} else {
			// do update
			empservice.update(employee);
		}

		return "redirect:/show";

	}

	// UpdateEmployee
	@GetMapping("/updateEmployee")
	public String showAddEmployee(@RequestParam("userid") int id, Model model) {
		Employee myEmp = empservice.getEmployee(id);
		// System.out.println(myEmp);

		model.addAttribute("employees", myEmp);

		return "addemp";

	}

	// deleteEmployee
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("userid") int id) {
		empservice.delete(id);
		return "redirect:/show";
	}

}
