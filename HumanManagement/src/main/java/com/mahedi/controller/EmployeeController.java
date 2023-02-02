package com.mahedi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mahedi.model.Employee;
import com.mahedi.service.EmployeeService;

//import com.mahedi.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// Show
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		return "index";
	}

	// Insert
	@GetMapping("/showNewEmployeeFrom")
	public String showNewEmployeeFrom(Model model) {
		Employee employee = new Employee();

		model.addAttribute("employee", employee);

		return "new_employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee emplpoyee) {
		employeeService.saveEmployee(emplpoyee);
		return "redirect:/";
	}

	// Update
	@GetMapping("/showFromForUpdate/{id}")
	public String showFromForUpdate(@PathVariable(value = "id") long id, Model model) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		model.addAttribute("employee", employee);

		return "update_employee";

	}

	// Delete
	@GetMapping("deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") long id) {
		this.employeeService.deleteEmployeeByID(id);
		return "redirect:/";
	}

	// @GetMapping("/api")
	// public Object[] api() {
	// System.out.println()
	// }

}
