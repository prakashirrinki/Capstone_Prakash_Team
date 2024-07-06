package com.wipro.mbcms.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Component
public class InsuranceCompanyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long insuranceCompanyId;
	private String insuranceCompanyName;
	
	@ManyToOne
	private InsurancePlanEntity insurancePlans;
	
	public InsuranceCompanyEntity(Long insuranceCompanyId, String insuranceCompanyName,
			InsurancePlanEntity insurancePlans) {
		super();
		this.insuranceCompanyId = insuranceCompanyId;
		this.insuranceCompanyName = insuranceCompanyName;
		this.insurancePlans = insurancePlans;
	}
	public InsuranceCompanyEntity() {
		super();
	}
	public Long getInsuranceCompanyId() {
		return insuranceCompanyId;
	}
	public void setInsuranceCompanyId(Long insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}
	public String getInsuranceCompanyName() {
		return insuranceCompanyName;
	}
	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}
	public InsurancePlanEntity getInsurancePlans() {
		return insurancePlans;
	}
	public void setInsurancePlans(InsurancePlanEntity insurancePlans) {
		this.insurancePlans = insurancePlans;
	}
	@Override
	public String toString() {
		return "InsuranceCompanyEntity [insuranceCompanyId=" + insuranceCompanyId + ", insuranceCompanyName="
				+ insuranceCompanyName + ", insurancePlans=" + insurancePlans + "]";
	}
	
	
	
	

}
