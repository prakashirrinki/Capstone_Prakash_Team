	package com.wipro.mbcms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

@Entity
public class InsurancePlansEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long insurancePlanId;
	@NotBlank
	private String insurancePlanName;
	private String insurancePlanType;
	@DecimalMax(value = "1000000")
	@DecimalMin(value = "100000")
	private double insurancePlanCoverAmount;
	private String insurancePlanDetails;
	@ManyToOne
	@JoinColumn(name = "insuranceCompanyId")
	private InsuranceCompanyEntity insuranceCompany;
	private String insuranceCompanyName;
	public InsurancePlansEntity(long insurancePlanId, @NotBlank String insurancePlanName, String insurancePlanType,
			@DecimalMax("1000000") @DecimalMin("100000") double insurancePlanCoverAmount, String insurancePlanDetails,
			InsuranceCompanyEntity insuranceCompany, String insuranceCompanyName) {
		super();
		this.insurancePlanId = insurancePlanId;
		this.insurancePlanName = insurancePlanName;
		this.insurancePlanType = insurancePlanType;
		this.insurancePlanCoverAmount = insurancePlanCoverAmount;
		this.insurancePlanDetails = insurancePlanDetails;
		this.insuranceCompany = insuranceCompany;
		this.insuranceCompanyName = insuranceCompanyName;
	}
	public InsurancePlansEntity() {
		super();
	}
	public long getInsurancePlanId() {
		return insurancePlanId;
	}
	public void setInsurancePlanId(long insurancePlanId) {
		this.insurancePlanId = insurancePlanId;
	}
	public String getInsurancePlanName() {
		return insurancePlanName;
	}
	public void setInsurancePlanName(String insurancePlanName) {
		this.insurancePlanName = insurancePlanName;
	}
	public String getInsurancePlanType() {
		return insurancePlanType;
	}
	public void setInsurancePlanType(String insurancePlanType) {
		this.insurancePlanType = insurancePlanType;
	}
	public double getInsurancePlanCoverAmount() {
		return insurancePlanCoverAmount;
	}
	public void setInsurancePlanCoverAmount(double insurancePlanCoverAmount) {
		this.insurancePlanCoverAmount = insurancePlanCoverAmount;
	}
	public String getInsurancePlanDetails() {
		return insurancePlanDetails;
	}
	public void setInsurancePlanDetails(String insurancePlanDetails) {
		this.insurancePlanDetails = insurancePlanDetails;
	}
	public InsuranceCompanyEntity getInsuranceCompany() {
		return insuranceCompany;
	}
	public void setInsuranceCompany(InsuranceCompanyEntity insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	public String getInsuranceCompanyName() {
		return insuranceCompanyName;
	}
	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}
	@Override
	public String toString() {
		return "InsurancePlansEntity [insurancePlanId=" + insurancePlanId + ", insurancePlanName=" + insurancePlanName
				+ ", insurancePlanType=" + insurancePlanType + ", insurancePlanCoverAmount=" + insurancePlanCoverAmount
				+ ", insurancePlanDetails=" + insurancePlanDetails + ", insuranceCompany=" + insuranceCompany
				+ ", insuranceCompanyName=" + insuranceCompanyName + "]";
	}
	
	


}
