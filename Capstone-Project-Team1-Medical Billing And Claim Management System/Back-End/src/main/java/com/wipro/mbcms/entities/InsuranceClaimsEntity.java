package com.wipro.mbcms.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;

@Entity
public class InsuranceClaimsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "claimSequence")
	@SequenceGenerator(name = "claimSequence", initialValue = 10000)
	private long insuranceClaimId;
//	@DecimalMin(value = "200000")
//	@DecimalMax(value = "800000")
	private double insuranceClaimAmount;
	private String insuranceClaimStatus;
//	@DecimalMax(value = "800000")
	private double invoiceAmount;
	@OneToOne
	@JoinColumn(name = "patientId")
	private PatientEntity patient;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "planId")
	private InsurancePlansEntity insurancePlans;

	public InsuranceClaimsEntity(long insuranceClaimId,
			@DecimalMin("200000") @DecimalMax("800000") double insuranceClaimAmount, String insuranceClaimStatus,
			@DecimalMax("800000") double invoiceAmount, PatientEntity patient, InsurancePlansEntity insurancePlans) {
		super();
		this.insuranceClaimId = insuranceClaimId;
		this.insuranceClaimAmount = insuranceClaimAmount;
		this.insuranceClaimStatus = insuranceClaimStatus;
		this.invoiceAmount = invoiceAmount;
		this.patient = patient;
		this.insurancePlans = insurancePlans;
	}

	public InsuranceClaimsEntity() {
		super();
	}

	public long getInsuranceClaimId() {
		return insuranceClaimId;
	}

	public void setInsuranceClaimId(long insuranceClaimId) {
		this.insuranceClaimId = insuranceClaimId;
	}

	public double getInsuranceClaimAmount() {
		return insuranceClaimAmount;
	}

	public void setInsuranceClaimAmount(double insuranceClaimAmount) {
		this.insuranceClaimAmount = insuranceClaimAmount;
	}

	public String getInsuranceClaimStatus() {
		return insuranceClaimStatus;
	}

	public void setInsuranceClaimStatus(String insuranceClaimStatus) {
		this.insuranceClaimStatus = insuranceClaimStatus;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public InsurancePlansEntity getInsurancePlans() {
		return insurancePlans;
	}

	public void setInsurancePlans(InsurancePlansEntity insurancePlans) {
		this.insurancePlans = insurancePlans;
	}

	@Override
	public String toString() {
		return "InsuranceClaimsEntity [insuranceClaimId=" + insuranceClaimId + ", insuranceClaimAmount="
				+ insuranceClaimAmount + ", insuranceClaimStatus=" + insuranceClaimStatus + ", invoiceAmount="
				+ invoiceAmount + ", patient=" + patient + ", insurancePlans=" + insurancePlans + "]";
	}

}
