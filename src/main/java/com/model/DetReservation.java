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
public class DetReservation {
	
	@Id
	@SequenceGenerator(name = "RESERVATIONDET_SEQ", sequenceName = "RESERVATIONDET_SEQ", initialValue = 1, allocationSize=1)
	@GeneratedValue(strategy = SEQUENCE, generator = "RESERVATIONDET_SEQ")
	private long id;
		
	private LocalDateTime createdDate;
	private String status;
	private double costService;
	
	@ManyToOne
	@JoinColumn(name="id_servicezone",referencedColumnName = "id")
	private ServiceZone serviceZone;
	@ManyToOne
	@JoinColumn(name="id_reservation",referencedColumnName = "id")
	private Reservation reservation;
	@ManyToOne
	@JoinColumn(name="id_pet",referencedColumnName = "id")
	private Pet pet;
	
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
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double getCostService() {
		return costService;
	}
	
	public void setCostService(double costService) {
		this.costService = costService;
	}
	
	public ServiceZone getServiceZone() {
		return serviceZone;
	}
	
	public void setServiceZone(ServiceZone serviceZone) {
		this.serviceZone = serviceZone;
	}
	
	public Reservation getReservation() {
		return reservation;
	}
	
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public Pet getPet() {
		return pet;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	

}
