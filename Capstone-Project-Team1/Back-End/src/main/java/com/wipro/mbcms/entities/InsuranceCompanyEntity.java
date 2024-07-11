package com.wipro.mbcms.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class InsuranceCompanyEntity {
	
	@Id
	@SequenceGenerator(name = "companySequence", initialValue = 1000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "companySequence")
	private long insuranceCompanyId;
	@NotNull
	private String companyName;
	private String insuranceCompanyPassword;
	@Email
	private String insuranceCompanyEmail;
	private long insuranceCompanyContact;
	@OneToMany(mappedBy = "insuranceCompany", cascade = CascadeType.ALL)
	private List<InsurancePlansEntity> insurancePlans;
	private final String role = "COMPANY";
	public InsuranceCompanyEntity(long insuranceCompanyId, @NotNull String companyName,
			@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Letter must be 5") String insuranceCompanyPassword,
			@Email String insuranceCompanyEmail,Long insuranceCompanyContact,
			List<InsurancePlansEntity> insurancePlans) {
		super();
		this.insuranceCompanyId = insuranceCompanyId;
		this.companyName = companyName;
		this.insuranceCompanyPassword = insuranceCompanyPassword;
		this.insuranceCompanyEmail = insuranceCompanyEmail;
		this.insuranceCompanyContact = insuranceCompanyContact;
		this.insurancePlans = insurancePlans;
	}
	public InsuranceCompanyEntity() {
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
		return "InsuranceCompanyEntity [insuranceCompanyId=" + insuranceCompanyId + ", companyName=" + companyName
				+ ", insuranceCompanyPassword=" + insuranceCompanyPassword + ", insuranceCompanyEmail="
				+ insuranceCompanyEmail + ", insuranceCompanyContact=" + insuranceCompanyContact + ", insurancePlans="
				+ insurancePlans + ", role=" + role + "]";
	}
	
	


}
