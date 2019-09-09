package com.model;

import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Race {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descRace;
	private LocalDateTime createdDate;
	private String status;
	@ManyToOne
	@JoinColumn(name="id_type_pet",referencedColumnName = "id")		
	private TypePet typePet;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescRace() {
		return descRace;
	}
	
	public void setDescRace(String descRace) {
		this.descRace = descRace;
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

	public TypePet getTypePet() {
		return typePet;
	}

	public void setTypePet(TypePet typePet) {
		this.typePet = typePet;
	}
	
	
		


}
