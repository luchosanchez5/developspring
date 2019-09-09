package com.model;

import static javax.persistence.GenerationType.SEQUENCE;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	
	@Id
	@SequenceGenerator(name = "CUSTOMER_SEQ", sequenceName = "CUSTOMER_SEQ", initialValue = 1, allocationSize=100)
	@GeneratedValue(strategy = SEQUENCE, generator = "CUSTOMER_SEQ")
	private long id;
	
	private String sureName;
	private String lastName;
	private String customerNumber;
	private String cellPhone;
	private String mobilPhone;
	private String address;
	private String idAddress;  // Este es un Id que capturare de las Address en google, por ahy se validadn
	private String city;
	private String state;
	private String zipCode;
	private LocalDateTime createdDate;
	private String statCustomer;  // Active, Suspend, Inactive
	private String status;  //Active , Deleted
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_location", joinColumns = @JoinColumn(name = "id_customer"), inverseJoinColumns = @JoinColumn(name = "id_location"))
	private Set<Customer> locations;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getSureName() {
		return sureName;
	}
	
	public void setSureName(String sureName) {
		this.sureName = sureName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCellPhone() {
		return cellPhone;
	}
	
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getMobilPhone() {
		return mobilPhone;
	}
	
	public void setMobilPhone(String mobilPhone) {
		this.mobilPhone = mobilPhone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getIdAddress() {
		return idAddress;
	}
	
	public void setIdAddress(String idAddress) {
		this.idAddress = idAddress;
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
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getStatCustomer() {
		return statCustomer;
	}
	
	public void setStatCustomer(String statCustomer) {
		this.statCustomer = statCustomer;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Customer> getLocations() {
		return locations;
	}

	public void setLocations(Set<Customer> locations) {
		this.locations = locations;
	}
	
	
	
	

}
