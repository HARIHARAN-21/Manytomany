package com.cusapplicationdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cusapplicationdemo.model.CustomerData;
import com.cusapplicationdemo.model.Orderdata;
import com.cusapplicationdemo.repository.OrderRepository;
import com.cusapplicationdemo.repository.Productrepository;
import com.cusapplicationdemo.repository.customerrepository;

@RestController
public class OrderController {
	

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private Productrepository product;
	
	@Autowired
	private customerrepository customer;

	@PostMapping(value="/save")
	public String insertData(@RequestBody Orderdata orderdata) {
		orderRepository.save(orderdata);
		return "Inserted Successfully";
	}
	
	
	@GetMapping(value="/notbuy")
	public List<Integer> getvalues(){
		
		return orderRepository.selectcustomerid();
	}
	
	
	@GetMapping(value="/particularprod/{id}")
	public List<Integer> particularprod(@PathVariable Integer id){
		return orderRepository.particularprod(id);
	}
	
	
	@GetMapping(value="/notsoldproduct")
	public List<Integer> notsoldproduct(){
		return orderRepository.selectproductid();
	}
	
}
