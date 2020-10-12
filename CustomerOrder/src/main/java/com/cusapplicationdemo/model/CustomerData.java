package com.cusapplicationdemo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class CustomerData {
	@Id
	@SequenceGenerator(name = "cus_id",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cus_id")
	private Integer customerid;
	private String customername;
	private String email;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(
//			name = "Orderdata",joinColumns = {@JoinColumn(name="cusid",referencedColumnName = "customerid")},inverseJoinColumns = {@JoinColumn(name="proid",referencedColumnName = "productid")}
//			)
//	private Set<ProductData> products = new HashSet<>();

	
	 @OneToMany(mappedBy = "id.customerdata",cascade = CascadeType.ALL)
	    private Set<Orderdata> orderdata = new HashSet<Orderdata>();
	
	

	public Set<Orderdata> getOrderdata() {
		return orderdata;
	}

	public void setOrderdata(Set<Orderdata> orderdata) {
		this.orderdata = orderdata;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public Set<ProductData> getProducts() {
//		return products;
//	}
//
//	public void setProducts(Set<ProductData> products) {
//		this.products = products;
//	}
//	
	
	
}
