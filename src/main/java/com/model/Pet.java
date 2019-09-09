package com.model;

import static javax.persistence.GenerationType.SEQUENCE;

import java.sql.Date;
import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Pet {

	
	@Id
	@SequenceGenerator(name = "PET_SEQ", sequenceName = "PET_SEQ", initialValue = 1, allocationSize=100)
	@GeneratedValue(strategy = SEQUENCE, generator = "PET_SEQ")
	private long id;
	
	private String petName;
	private Date dob;   //Fecha de Nacimiento
	private double height;
	private double weight;
	private LocalDateTime createdDate;
	private LocalDateTime downDate;
	@ManyToOne
	@JoinColumn(name="id_race",referencedColumnName = "id")		
	private Race race;
	@ManyToOne
	@JoinColumn(name="id_type_pet",referencedColumnName = "id")		
	private TypePet typePet;
	@ManyToOne
	@JoinColumn(name="id_customer",referencedColumnName = "id")
	private Customer customer;	
	private String statPet;
	private String status;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public LocalDateTime getDownDate() {
		return downDate;
	}
	
	public void setDownDate(LocalDateTime downDate) {
		this.downDate = downDate;
	}
	
	public Race getRace() {
		return race;
	}
	
	public void setRace(Race race) {
		this.race = race;
	}
	
	public TypePet getTypePet() {
		return typePet;
	}
	
	public void setTypePet(TypePet typePet) {
		this.typePet = typePet;
	}
	
	public String getStatPet() {
		return statPet;
	}
	
	public void setStatPet(String statPet) {
		this.statPet = statPet;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
}
