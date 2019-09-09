package com.model;

import static javax.persistence.GenerationType.SEQUENCE;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	
	@Id
	@SequenceGenerator(name = "EMP_SEQ", sequenceName = "EMP_SEQ", initialValue = 1, allocationSize=1)
	@GeneratedValue(strategy = SEQUENCE, generator = "EMP_SEQ")
	private long id;
	
	private String sureName;
	private String lastName;
	private LocalDateTime createdDate;
	private LocalDateTime admissionDate;
	@ManyToOne
	@JoinColumn(name="id_typeemployee",referencedColumnName = "id")		
	private TypeEmployee typeEmployee;
	private String statEmployee;
	private String status;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
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
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public LocalDateTime getAdmissionDate() {
		return admissionDate;
	}
	
	public void setAdmissionDate(LocalDateTime admissionDate) {
		this.admissionDate = admissionDate;
	}
	
	public TypeEmployee getTypeEmployee() {
		return typeEmployee;
	}
	
	public void setTypeEmployee(TypeEmployee typeEmployee) {
		this.typeEmployee = typeEmployee;
	}
	
	public String getStatEmployee() {
		return statEmployee;
	}
	
	public void setStatEmployee(String statEmployee) {
		this.statEmployee = statEmployee;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	

}
