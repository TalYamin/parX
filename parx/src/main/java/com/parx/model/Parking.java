package com.parx.model;

import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.parx.utils.DateConverterUtil;

@Component
@Entity
public class Parking {

	private long id;
	private String licenseId;
	private String location;
	private LocalDate date;
	
	@Transient
	private String customeDate;
	
	public Parking() {
	
	}
	

	public Parking(String licenseId, String location, String date) {
		setLicenseId(licenseId);
		setLocation(location);
		setDate(DateConverterUtil.convertStringDate(date));
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
	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	@Basic(optional = false)
	@Column(nullable = false)
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@Basic(optional = false)
	@Column(nullable = false)
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}


	@Override
	public String toString() {
		
		customeDate = DateConverterUtil.DateStringFormat(this.date);
		
		return "Parking [id=" + id + ", licenseId=" + licenseId + ", location=" + location + ", customeDate="
				+ customeDate + "]";
	}
	
	
	
	
	
	

}


