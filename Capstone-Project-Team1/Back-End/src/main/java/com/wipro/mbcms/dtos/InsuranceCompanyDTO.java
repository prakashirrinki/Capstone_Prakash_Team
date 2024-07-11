package com.wipro.mbcms.dtos;

import java.util.List;

import com.wipro.mbcms.entities.InsurancePlansEntity;

public class InsuranceCompanyDTO {
	
	private long insuranceCompanyId;
	private String companyName;
	private String insuranceCompanyPassword;
	private String insuranceCompanyEmail;
	private long insuranceCompanyContact;
	private List<InsurancePlansEntity> insurancePlans;
	private final String role = "COMPANY";
	public InsuranceCompanyDTO(long insuranceCompanyId, String companyName, String insuranceCompanyPassword,
			String insuranceCompanyEmail, Long insuranceCompanyContact, List<InsurancePlansEntity> insurancePlans) {
		super();
		this.insuranceCompanyId = insuranceCompanyId;
		this.companyName = companyName;
		this.insuranceCompanyPassword = insuranceCompanyPassword;
		this.insuranceCompanyEmail = insuranceCompanyEmail;
		this.insuranceCompanyContact = insuranceCompanyContact;
		this.insurancePlans = insurancePlans;
	}
	public InsuranceCompanyDTO() {
		super();
	}
	public long getInsuranceCompanyId() {
		return insuranceCompanyId;
	}
	public void setInsuranceCompanyId(long insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getInsuranceCompanyPassword() {
		return insuranceCompanyPassword;
	}
	public void setInsuranceCompanyPassword(String insuranceCompanyPassword) {
		this.insuranceCompanyPassword = insuranceCompanyPassword;
	}
	public String getInsuranceCompanyEmail() {
		return insuranceCompanyEmail;
	}
	public void setInsuranceCompanyEmail(String insuranceCompanyEmail) {
		this.insuranceCompanyEmail = insuranceCompanyEmail;
	}
	
	public long getInsuranceCompanyContact() {
		return insuranceCompanyContact;
	}
	public void setInsuranceCompanyContact(long insuranceCompanyContact) {
		this.insuranceCompanyContact = insuranceCompanyContact;
	}
	public List<InsurancePlansEntity> getInsurancePlans() {
		return insurancePlans;
	}
	public void setInsurancePlans(List<InsurancePlansEntity> insurancePlans) {
		this.insurancePlans = insurancePlans;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "InsuranceCompanyDTO [insuranceCompanyId=" + insuranceCompanyId + ", companyName=" + companyName
				+ ", insuranceCompanyPassword=" + insuranceCompanyPassword + ", insuranceCompanyEmail="
				+ insuranceCompanyEmail + ", insuranceCompanyContact=" + insuranceCompanyContact + ", insurancePlans="
				+ insurancePlans + ", role=" + role + "]";
	}
	
	


}
