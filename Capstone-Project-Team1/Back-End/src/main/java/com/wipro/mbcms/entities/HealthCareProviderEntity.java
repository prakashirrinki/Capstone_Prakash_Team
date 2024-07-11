package com.wipro.mbcms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class HealthCareProviderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long healthCareProviderId;
	@NotBlank
	private String providerName;
	@NotBlank
	private String healthCareProviderPassword;
	@Email
	private String healthCareProviderEmail;
	private String healthCareProviderSpeciality;
	private final String role = "HEALTHCAREPROVIDER";
	public HealthCareProviderEntity(Long healthCareProviderId, @NotBlank String providerName,
			@NotBlank String healthCareProviderPassword, @Email String healthCareProviderEmail,
			String healthCareProviderSpeciality) {
		super();
		this.healthCareProviderId = healthCareProviderId;
		this.providerName = providerName;
		this.healthCareProviderPassword = healthCareProviderPassword;
		this.healthCareProviderEmail = healthCareProviderEmail;
		this.healthCareProviderSpeciality = healthCareProviderSpeciality;
	}
	public HealthCareProviderEntity() {
		super();
	}
	public Long getHealthCareProviderId() {
		return healthCareProviderId;
	}
	public void setHealthCareProviderId(Long healthCareProviderId) {
		this.healthCareProviderId = healthCareProviderId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getHealthCareProviderPassword() {
		return healthCareProviderPassword;
	}
	public void setHealthCareProviderPassword(String healthCareProviderPassword) {
		this.healthCareProviderPassword = healthCareProviderPassword;
	}
	public String getHealthCareProviderEmail() {
		return healthCareProviderEmail;
	}
	public void setHealthCareProviderEmail(String healthCareProviderEmail) {
		this.healthCareProviderEmail = healthCareProviderEmail;
	}
	public String getHealthCareProviderSpeciality() {
		return healthCareProviderSpeciality;
	}
	public void setHealthCareProviderSpeciality(String healthCareProviderSpeciality) {
		this.healthCareProviderSpeciality = healthCareProviderSpeciality;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "HealthCareProviderEntity [healthCareProviderId=" + healthCareProviderId + ", providerName="
				+ providerName + ", healthCareProviderPassword=" + healthCareProviderPassword
				+ ", healthCareProviderEmail=" + healthCareProviderEmail + ", healthCareProviderSpeciality="
				+ healthCareProviderSpeciality + ", role=" + role + "]";
	}
	
	


}
