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
public class ServiceZone {
	
	
	@Id
	@SequenceGenerator(name = "SERVICEZONE_SEQ", sequenceName = "SERVICEZONE_SEQ", initialValue = 1, allocationSize=100)
	@GeneratedValue(strategy = SEQUENCE, generator = "SERVICEZONE_SEQ")
	private long id;
	private LocalDateTime createdDate;
	private double price;
	@ManyToOne
	@JoinColumn(name="id_service",referencedColumnName = "id")
	private Service service;
	@ManyToOne
	@JoinColumn(name="id_zone",referencedColumnName = "id")
	private Zone zone;
	private String statServiceZone;
	private String Status;
	
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
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Service getService() {
		return service;
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public Zone getZone() {
		return zone;
	}
	
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	public String getStatServiceZone() {
		return statServiceZone;
	}
	
	public void setStatServiceZone(String statServiceZone) {
		this.statServiceZone = statServiceZone;
	}
	
	public String getStatus() {
		return Status;
	}
	
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	
	
	
	

}
