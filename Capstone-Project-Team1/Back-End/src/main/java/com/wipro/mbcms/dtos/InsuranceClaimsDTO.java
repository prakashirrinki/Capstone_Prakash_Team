package com.wipro.mbcms.dtos;

import com.wipro.mbcms.entities.InsurancePlansEntity;
import com.wipro.mbcms.entities.PatientEntity;

public class InsuranceClaimsDTO {
	
	private long insuranceClaimId;
	private double insuranceClaimAmount;
	private String insuranceClaimStatus;
	private double invoiceAmount;
	private PatientEntity patient;
	private InsurancePlansEntity insurancePlans;
	public InsuranceClaimsDTO(long insuranceClaimId, double insuranceClaimAmount, String insuranceClaimStatus,
			double invoiceAmount, PatientEntity patient, InsurancePlansEntity insurancePlans) {
		super();
		this.insuranceClaimId = insuranceClaimId;
		this.insuranceClaimAmount = insuranceClaimAmount;
		this.insuranceClaimStatus = insuranceClaimStatus;
		this.invoiceAmount = invoiceAmount;
		this.patient = patient;
		this.insurancePlans = insurancePlans;
	}
	public InsuranceClaimsDTO() {
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
		return "InsuranceClaimsDTO [insuranceClaimId=" + insuranceClaimId + ", insuranceClaimAmount="
				+ insuranceClaimAmount + ", insuranceClaimStatus=" + insuranceClaimStatus + ", invoiceAmount="
				+ invoiceAmount + ", patient=" + patient + ", insurancePlans=" + insurancePlans + "]";
	}
	
	

}
