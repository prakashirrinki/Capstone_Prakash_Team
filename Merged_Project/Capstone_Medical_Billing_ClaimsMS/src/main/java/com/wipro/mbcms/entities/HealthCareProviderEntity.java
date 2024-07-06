package com.wipro.mbcms.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class HealthCareProviderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long healthCareProviderId;
	private String healthCareProviderName;
	private String specialization;
	private String licenseNumber;

	public HealthCareProviderEntity(long healthCareProviderId, String healthCareProviderName, String specialization,
			String licenseNumber) {
		super();
		this.healthCareProviderId = healthCareProviderId;
		this.healthCareProviderName = healthCareProviderName;
		this.specialization = specialization;
		this.licenseNumber = licenseNumber;
	}

	public HealthCareProviderEntity() {
		super();
	}

	public long getHealthCareProviderId() {
		return healthCareProviderId;
	}

	public void setHealthCareProviderId(long healthCareProviderId) {
		this.healthCareProviderId = healthCareProviderId;
	}

	public String getHealthCareProviderName() {
		return healthCareProviderName;
	}

	public void setHealthCareProviderName(String healthCareProviderName) {
		this.healthCareProviderName = healthCareProviderName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "HealthCareProviderEntity [healthCareProviderId=" + healthCareProviderId + ", healthCareProviderName="
				+ healthCareProviderName + ", specialization=" + specialization + ", licenseNumber=" + licenseNumber
				+ "]";
	}

}
