package com.employee.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.employee.management.service.EmployeeService;

public class EmployeeModelController {

@Autowired
EmployeeService empservice;

@GetMapping("")
public String HomePage() {
	return "login";
}
@RequestMapping(value="/addemployee", method=RequestMethod.POST)
public String addEmployee(Model model, @Valid EmployeeEntity empEnt, Binding result) {
	if (result.hasErrors()) {
		return "addemployee";
	}
}
	
}
