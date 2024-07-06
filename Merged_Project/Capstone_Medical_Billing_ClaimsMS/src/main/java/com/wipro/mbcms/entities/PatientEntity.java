package com.wipro.mbcms.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long patientId;
	private String patientFullName;
	private String patientEmail;
	private String gender;
	private Date dateOfBirth;
	private int mobileNumber;
	private String address;
	private String symptoms;
	private String treatment;

	public PatientEntity(Long patientId, String patientFullName, String patientEmail, String gender, Date dateOfBirth,
			int mobileNumber, String address, String symptoms, String treatment) {
		super();
		this.patientId = patientId;
		this.patientFullName = patientFullName;
		this.patientEmail = patientEmail;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.symptoms = symptoms;
		this.treatment = treatment;
	}

	public PatientEntity() {
		super();
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientFullName() {
		return patientFullName;
	}

	public void setPatientFullName(String patientFullName) {
		this.patientFullName = patientFullName;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	@Override
	public String toString() {
		return "PatientEntity [patientId=" + patientId + ", patientFullName=" + patientFullName + ", patientEmail="
				+ patientEmail + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", mobileNumber="
				+ mobileNumber + ", address=" + address + ", symptoms=" + symptoms + ", treatment=" + treatment + "]";
	}

}
