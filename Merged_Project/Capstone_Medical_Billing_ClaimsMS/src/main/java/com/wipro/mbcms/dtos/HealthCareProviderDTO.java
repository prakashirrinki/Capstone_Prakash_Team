package com.wipro.mbcms.dtos;

import org.springframework.stereotype.Component;

@Component
public class HealthCareProviderDTO {

	private long healthCareProviderId;
	private String healthCareProviderName;
	private String specialization;
	private String licenseNumber;

	public HealthCareProviderDTO(long healthCareProviderId, String healthCareProviderName, String specialization,
			String licenseNumber) {
		super();
		this.healthCareProviderId = healthCareProviderId;
		this.healthCareProviderName = healthCareProviderName;
		this.specialization = specialization;
		this.licenseNumber = licenseNumber;
	}

	public HealthCareProviderDTO() {
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
		return "HealthCareProviderDTO [healthCareProviderId=" + healthCareProviderId + ", healthCareProviderName="
				+ healthCareProviderName + ", specialization=" + specialization + ", licenseNumber=" + licenseNumber
				+ "]";
	}

}
