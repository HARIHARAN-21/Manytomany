package com.cusapplicationdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cusapplicationdemo.model.CustomerData;
import com.cusapplicationdemo.repository.customerrepository;

@RestController
public class Customercontroller {
	
	@Autowired
	private customerrepository customerRepository;

	@PostMapping(value="/insert")
	public String insertData(@RequestBody CustomerData cust) {
		customerRepository.save(cust);
		return "Inserted Successfully";
	}
	
//	@GetMapping(value="/read")
//	public List<CustomerData> getdata() {
//		return customerRepository.findAll();
//	}
	
//	@GetMapping(value="/read")
//	public CustomerData getdata(){
//		return customerRepository.findallCustomers();
//	}
}
