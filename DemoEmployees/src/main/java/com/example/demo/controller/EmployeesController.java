package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employees;
import com.example.demo.service.EmployeesService;

@RestController
public class EmployeesController {
  
	@Autowired
	private EmployeesService ss;
	
	@GetMapping("/display")
	public List<Employees>displayEmployeess(){
		
		return ss.display();
		
	}
	
	@PostMapping("/add")
    public void addEmployees(Employees s) {	
		ss.add(s);
	}
}
