package com.wipro.mbcms.dtos;

public class HealthCareProviderDTO {
	
	private Long healthCareProviderId;
	private String providerName;
	private String healthCareProviderPassword;
	private String healthCareProviderEmail;
	private String healthCareProviderSpeciality;
	private final String role = "HEALTHCAREPROVIDER";
	public HealthCareProviderDTO(Long healthCareProviderId, String providerName, String healthCareProviderPassword,
			String healthCareProviderEmail, String healthCareProviderSpeciality) {
		super();
		this.healthCareProviderId = healthCareProviderId;
		this.providerName = providerName;
		this.healthCareProviderPassword = healthCareProviderPassword;
		this.healthCareProviderEmail = healthCareProviderEmail;
		this.healthCareProviderSpeciality = healthCareProviderSpeciality;
	}
	public HealthCareProviderDTO() {
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
		return "HealthCareProviderDTO [healthCareProviderId=" + healthCareProviderId + ", providerName=" + providerName
				+ ", healthCareProviderPassword=" + healthCareProviderPassword + ", healthCareProviderEmail="
				+ healthCareProviderEmail + ", healthCareProviderSpeciality=" + healthCareProviderSpeciality + ", role="
				+ role + "]";
	}
	
	
	
	

}
