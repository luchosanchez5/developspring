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
public class Bill {
	
	@Id
	@SequenceGenerator(name = "BILL_SEQ", sequenceName = "BILL_SEQ", initialValue = 1, allocationSize=100)
	@GeneratedValue(strategy = SEQUENCE, generator = "BILL_SEQ")
	private long id;
	private String billNumber;    // Ej;   B20190001, B20190002
	private LocalDateTime createdDate;
	private LocalDateTime billDate;
	
	private double baseAmount;
	private double taxes;
	private double totalAmount;
	@ManyToOne
	@JoinColumn(name="id_reservation",referencedColumnName = "id")
	private Reservation reservation;
	private String statBill;
	private String status;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getBillNumber() {
		return billNumber;
	}
	
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public LocalDateTime getBillDate() {
		return billDate;
	}
	
	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}
	
	public double getBaseAmount() {
		return baseAmount;
	}
	
	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}
	
	public double getTaxes() {
		return taxes;
	}
	
	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Reservation getReservation() {
		return reservation;
	}
	
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public String getStatBill() {
		return statBill;
	}
	
	public void setStatBill(String statBill) {
		this.statBill = statBill;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
