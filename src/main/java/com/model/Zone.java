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

public class Zone {
	
	@Id
	@SequenceGenerator(name = "ZONE_SEQ", sequenceName = "ZONE_SEQ", initialValue = 1, allocationSize=100)
	@GeneratedValue(strategy = SEQUENCE, generator = "ZONE_SEQ")
	private long id;
	
	private String descZone;
	private LocalDateTime createdDate;
	private String statZone;
	private String status;
	@ManyToOne
	@JoinColumn(name="id_location",referencedColumnName = "id")
	private Location location;
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescZone() {
		return descZone;
	}
	
	public void setDescZone(String descZone) {
		this.descZone = descZone;
	}
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getStatZone() {
		return statZone;
	}
	
	public void setStatZone(String statZone) {
		this.statZone = statZone;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
	
	

}
