package com.wipro.mbcms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InsurancePlanEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String planName;
	private String coverage;
	private Double premium;
	private InsuranceCompanyEntity insuranceCompany;

	public InsurancePlanEntity(Long id, String planName, String coverage, Double premium,
			InsuranceCompanyEntity insuranceCompany) {
		super();
		this.id = id;
		this.planName = planName;
		this.coverage = coverage;
		this.premium = premium;
		this.insuranceCompany = insuranceCompany;
	}

	public InsurancePlanEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public InsuranceCompanyEntity getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(InsuranceCompanyEntity insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	@Override
	public String toString() {
		return "InsurancePlanEntity [id=" + id + ", planName=" + planName + ", coverage=" + coverage + ", premium="
				+ premium + ", insuranceCompany=" + insuranceCompany + "]";
	}

}
