package com.cusapplicationdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cusapplicationdemo.model.CustomerData;

public interface customerrepository extends JpaRepository<CustomerData, Integer>{
	
	

}
