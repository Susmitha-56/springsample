package com.dbs.springmvcapp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.springmvcapp.model.Employee;
import com.dbs.springmvcapp.service.EmployeeService;

@RestController
@RequestMapping("/api/v2")
public class UserRestController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping(value="/users", produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> fetchAllEmployees()
	{
		return this.employeeservice.listAll();
	}

}
