package com.cusapplicationdemo.model;

import java.beans.Transient;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
@AssociationOverrides({
	@AssociationOverride(name="id.productid",joinColumns = @JoinColumn(name="productid")),
	@AssociationOverride(name="id.customerid",joinColumns = @JoinColumn(name="customerid"))
})
public class Orderdata{


	@EmbeddedId
	private OrderdataId id = new OrderdataId();
	
	@Column(name="orderdate")
	private LocalDate date = LocalDate.now(); 

	
	 @Transient
	    public CustomerData getCustomerData() {
	        return getId().getCustomerdata();
	    }
	 
	    public void setCustomerData(CustomerData customerdata) {
	        getId().setCustomerdata(customerdata);;
	    }
	 
	    @Transient
	    public ProductData getProductData() {
	        return getId().getProductdata();
	    }
	 
	    public void setGroup(ProductData productdata) {
	        getId().setProductdata(productdata);
	    }	    
//	@ManyToOne
//	@MapsId("customerid")
//	@JoinColumn(name="customerid")
//	private CustomerData customerdata;
//	
//	
//	@ManyToOne
//	@MapsId("productid")
//	@JoinColumn(name="productid")
//	private ProductData productdata;


	public OrderdataId getId() {
		return id;
	}


	public void setId(OrderdataId id) {
		this.id = id;
	}

//
//	public CustomerData getCustomerdata() {
//		return customerdata;
//	}
//
//
//	public void setCustomerdata(CustomerData customerdata) {
//		this.customerdata = customerdata;
//	}
//
//
//	public ProductData getProductdata() {
//		return productdata;
//	}
//
//
//	public void setProductdata(ProductData productdata) {
//		this.productdata = productdata;
//	}

	
	
	
}
