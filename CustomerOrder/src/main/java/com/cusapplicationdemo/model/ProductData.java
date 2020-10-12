package com.cusapplicationdemo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class ProductData {
	
	@Id
	@SequenceGenerator(name = "pro_id",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pro_id")
	private Integer productid;
	private String productname;
	private Integer productprice;
//	@ManyToMany(mappedBy = "products",cascade = CascadeType.ALL)
//	private Set<CustomerData> customers = new HashSet<>();

	
	

	 @OneToMany(mappedBy = "id.productdata",cascade = CascadeType.ALL)
	    private Set<Orderdata> orderdata = new HashSet<Orderdata>();
	

	public Integer getProductrice() {
		return productprice;
	}

	public void setProductrice(Integer productprice) {
		this.productprice = productprice;
	}

	public Set<Orderdata> getOrderdata() {
		return orderdata;
	}

	public void setOrderdata(Set<Orderdata> orderdata) {
		this.orderdata = orderdata;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

//	public Set<CustomerData> getCustomers() {
//		return customers;
//	}
//
//	public void setCustomers(Set<CustomerData> customers) {
//		this.customers = customers;
//	}
	
	
	

}
