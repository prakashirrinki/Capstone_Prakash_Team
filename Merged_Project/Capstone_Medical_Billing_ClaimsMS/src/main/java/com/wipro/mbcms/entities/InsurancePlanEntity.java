package com.wipro.mbcms.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Component
public class InsurancePlanEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long planIid;
	private String planName;
	private String coverage;
	private Double premium;
	
	@ManyToOne
    @JoinColumn(name = "insurance_company_id", nullable = false)
	private InsuranceCompanyEntity insuranceCompanyName;

	public InsurancePlanEntity(Long planIid, String planName, String coverage, Double premium,
			InsuranceCompanyEntity insuranceCompanyName) {
		super();
		this.planIid = planIid;
		this.planName = planName;
		this.coverage = coverage;
		this.premium = premium;
		this.insuranceCompanyName = insuranceCompanyName;
	}

	public InsurancePlanEntity() {
		super();
	}

	public Long getPlanIid() {
		return planIid;
	}

	public void setPlanIid(Long planIid) {
		this.planIid = planIid;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	public InsuranceCompanyEntity getInsuranceCompanyName() {
		return insuranceCompanyName;
	}

	public void setInsuranceCompanyName(InsuranceCompanyEntity insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}

	@Override
	public String toString() {
		return "InsurancePlanEntity [planIid=" + planIid + ", planName=" + planName + ", coverage=" + coverage
				+ ", premium=" + premium + ", insuranceCompanyName=" + insuranceCompanyName + "]";
	}

}
