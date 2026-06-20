package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employees;
import com.example.demo.repository.EmployeesRepository;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	
	@Autowired
     private EmployeesRepository sr;
	
	@Override
	public void add(Employees s) {
		// TODO Auto-generated method stub
        sr.save(s);
	}

	@Override
	public List<Employees> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
