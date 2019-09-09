package com.model;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class CustomerAddress {
	
	@Id
	@SequenceGenerator(name = "CUSTADD_SEQ", sequenceName = "CUSTADD_SEQ", initialValue = 1, allocationSize=100)
	@GeneratedValue(strategy = SEQUENCE, generator = "CUSTADD_SEQ")
	private long id;
	
	private String googleId;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String status;
	@ManyToOne
	@JoinColumn(name="id_customer",referencedColumnName = "id")
	private Customer customer;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getGoogleId() {
		return googleId;
	}
	
	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}	
	
	
	
	

}
