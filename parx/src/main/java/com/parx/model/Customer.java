package com.parx.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Customer {

	private long id;
	private String phone;
	private String password;
	private Parking parking;

	public Customer() {

	}

	public Customer(String phone, String password, Parking parking) {
		setPhone(phone);
		setPassword(password);
		setParking(parking);
	}

	@Id
	@GeneratedValue
	@Basic(optional = false)
	@Column(nullable = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic(optional = false)
	@Column(nullable = false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Basic(optional = false)
	@Column(nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToOne
	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", phone=" + phone + ", password=" + password + "]";
	}
	
	

	
	
}
