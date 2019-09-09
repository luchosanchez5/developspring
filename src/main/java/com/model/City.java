package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String descCity;
	private String zipCode;
	private String state;
	private String status;
	@ManyToOne
	@JoinColumn(name="id_zone",referencedColumnName = "id")
	private Zone zone;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescCity() {
		return descCity;
	}
	public void setDescCity(String descCity) {
		this.descCity = descCity;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	

}
