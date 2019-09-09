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
public class Service {
	
	@Id
	@SequenceGenerator(name = "SERVICE_SEQ", sequenceName = "SERVICE_SEQ", initialValue = 1, allocationSize=100)
	@GeneratedValue(strategy = SEQUENCE, generator = "SERVICE_SEQ")
	private long id;
	private String descService;
	private LocalDateTime createdDate;
	@ManyToOne
	@JoinColumn(name="id_location",referencedColumnName = "id")
	private Location location;
	private int duration;
	private double baseCost;  // Costo Basico del Servicio, por Zona se puede agregar otro costo, y agregar un parametro en la zona de cual costo se usara para los servicios.
	private String statService;
	private String status;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescService() {
		return descService;
	}
	
	public void setDescService(String descService) {
		this.descService = descService;
	}
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public double getBaseCost() {
		return baseCost;
	}
	
	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}
	
	public String getStatService() {
		return statService;
	}
	
	public void setStatService(String statService) {
		this.statService = statService;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
}
	
	
