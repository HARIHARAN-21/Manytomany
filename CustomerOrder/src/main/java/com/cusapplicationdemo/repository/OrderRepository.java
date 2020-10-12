package com.cusapplicationdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cusapplicationdemo.model.Orderdata;

public interface OrderRepository extends JpaRepository<Orderdata, Integer>{

	@Query(value = "select customerid from Customer_Data where customerid not in (Select CustomerData_customerid from OrderData)",nativeQuery = true)
	List<Integer> selectcustomerid();
	
	
	@Query(value = "select productid from Product_Data where productid not in (Select ProductData_productid from OrderData)",nativeQuery = true)
	List<Integer> selectproductid();
	
	
	@Query(value="Select CustomerData_customerid from OrderData where ProductData_productid=?",nativeQuery = true)
	List<Integer> particularprod(Integer id);
}
