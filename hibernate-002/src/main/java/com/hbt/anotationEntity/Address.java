package com.hbt.anotationEntity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@Entity
@Table(name="student_address")
public class Address {
	
	public Address(String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	
	@Column(length = 50,name = "Street")
	private String street;
	
	@Column(length=100,name="CITY")
	private String city;
	
	@Column(name = "is_open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Column(name = "added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob
	private byte[] image;

}
