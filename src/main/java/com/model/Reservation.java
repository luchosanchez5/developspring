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
public class Reservation {
	
	@Id
	@SequenceGenerator(name = "RESERV_SEQ", sequenceName = "RESERV_SEQ", initialValue = 1, allocationSize=100)
	@GeneratedValue(strategy = SEQUENCE, generator = "RESERV_SEQ")
	private long id;
	
	private LocalDateTime createdDate;
	@ManyToOne
	@JoinColumn(name="id_customer",referencedColumnName = "id")
	private Customer customer;
	private LocalDateTime appoimentDate;
	private LocalDateTime initReservation;  //Hora incial 
	private LocalDateTime endReservation;     //Hora Final
	private int totalServices;
	private double totalbaseCost;
	private String notes;
	private String statReservation;
	private String status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDateTime getAppoimentDate() {
		return appoimentDate;
	}
	public void setAppoimentDate(LocalDateTime appoimentDate) {
		this.appoimentDate = appoimentDate;
	}
	public LocalDateTime getInitReservation() {
		return initReservation;
	}
	public void setInitReservation(LocalDateTime initReservation) {
		this.initReservation = initReservation;
	}
	public LocalDateTime getEndReservation() {
		return endReservation;
	}
	public void setEndReservation(LocalDateTime endReservation) {
		this.endReservation = endReservation;
	}
	public int getTotalServices() {
		return totalServices;
	}
	public void setTotalServices(int totalServices) {
		this.totalServices = totalServices;
	}
	public double getTotalbaseCost() {
		return totalbaseCost;
	}
	public void setTotalbaseCost(double totalbaseCost) {
		this.totalbaseCost = totalbaseCost;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getStatReservation() {
		return statReservation;
	}
	public void setStatReservation(String statReservation) {
		this.statReservation = statReservation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	

}
