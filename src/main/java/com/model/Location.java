package com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import static javax.persistence.GenerationType.SEQUENCE;

import java.time.LocalDateTime;

@Entity
public class Location {
	
    @Id
    @SequenceGenerator(name = "PART_SEQ", sequenceName = "PART_SEQ", initialValue = 1, allocationSize=100)
    @GeneratedValue(strategy = SEQUENCE, generator = "PART_SEQ")
    private long id;
    
    private String descLocation;
    private LocalDateTime createdDate;
    private String status;
    
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescLocation() {
		return descLocation;
	}
	
	public void setDescLocation(String descLocation) {
		this.descLocation = descLocation;
	}
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
    

}
