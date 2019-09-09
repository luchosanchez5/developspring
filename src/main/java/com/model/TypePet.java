package com.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypePet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private LocalDateTime createdDate;
	private String desctypePet;
	private String status;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDesctypePet() {
		return desctypePet;
	}
	
	public void setDesctypePet(String desctypePet) {
		this.desctypePet = desctypePet;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	

}
