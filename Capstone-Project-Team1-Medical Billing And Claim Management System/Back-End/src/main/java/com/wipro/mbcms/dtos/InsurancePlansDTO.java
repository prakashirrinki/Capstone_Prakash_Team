package com.wipro.mbcms.dtos;

import com.wipro.mbcms.entities.InsuranceCompanyEntity;

public class InsurancePlansDTO {
	
	private long insurancePlanId;
	private String insurancePlanName;
	private String insurancePlanType;
	private double insurancePlanCoverAmount;
	private String insurancePlanDetails;
	private InsuranceCompanyEntity insuranceCompany;
	private String insuranceCompanyName;
	public InsurancePlansDTO(long insurancePlanId, String insurancePlanName, String insurancePlanType,
			double insurancePlanCoverAmount, String insurancePlanDetails, InsuranceCompanyEntity insuranceCompany,
			String insuranceCompanyName) {
		super();
		this.insurancePlanId = insurancePlanId;
		this.insurancePlanName = insurancePlanName;
		this.insurancePlanType = insurancePlanType;
		this.insurancePlanCoverAmount = insurancePlanCoverAmount;
		this.insurancePlanDetails = insurancePlanDetails;
		this.insuranceCompany = insuranceCompany;
		this.insuranceCompanyName = insuranceCompanyName;
	}
	public InsurancePlansDTO() {
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
		return "InsurancePlansDTO [insurancePlanId=" + insurancePlanId + ", insurancePlanName=" + insurancePlanName
				+ ", insurancePlanType=" + insurancePlanType + ", insurancePlanCoverAmount=" + insurancePlanCoverAmount
				+ ", insurancePlanDetails=" + insurancePlanDetails + ", insuranceCompany=" + insuranceCompany
				+ ", insuranceCompanyName=" + insuranceCompanyName + "]";
	}
	
	

}
