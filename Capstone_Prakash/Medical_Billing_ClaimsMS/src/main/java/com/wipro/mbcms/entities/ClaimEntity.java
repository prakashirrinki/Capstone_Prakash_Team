package com.wipro.mbcms.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClaimEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long claimId;
	private Date dateOfService;
	private String diagnosis;
	private String treatement;
	private double claimAmount;
	private String status;
	private Date submissionDate;
	private Date approvalDate;
	
	private PatientEntity patientEntity;
	
	private InsurancePlanEntity insurancePlanEntity;
	
	private InvoiceEntity invoiceEntity;

	public ClaimEntity(long claimId, Date dateOfService, String diagnosis, String treatement, double claimAmount,
			String status, Date submissionDate, Date approvalDate, PatientEntity patientEntity,
			InsurancePlanEntity insurancePlanEntity, InvoiceEntity invoiceEntity) {
		super();
		this.claimId = claimId;
		this.dateOfService = dateOfService;
		this.diagnosis = diagnosis;
		this.treatement = treatement;
		this.claimAmount = claimAmount;
		this.status = status;
		this.submissionDate = submissionDate;
		this.approvalDate = approvalDate;
		this.patientEntity = patientEntity;
		this.insurancePlanEntity = insurancePlanEntity;
		this.invoiceEntity = invoiceEntity;
	}

	public ClaimEntity() {
		super();
	}

	public long getClaimId() {
		return claimId;
	}

	public void setClaimId(long claimId) {
		this.claimId = claimId;
	}

	public Date getDateOfService() {
		return dateOfService;
	}

	public void setDateOfService(Date dateOfService) {
		this.dateOfService = dateOfService;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatement() {
		return treatement;
	}

	public void setTreatement(String treatement) {
		this.treatement = treatement;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public PatientEntity getPatientEntity() {
		return patientEntity;
	}

	public void setPatientEntity(PatientEntity patientEntity) {
		this.patientEntity = patientEntity;
	}

	public InsurancePlanEntity getInsurancePlanEntity() {
		return insurancePlanEntity;
	}

	public void setInsurancePlanEntity(InsurancePlanEntity insurancePlanEntity) {
		this.insurancePlanEntity = insurancePlanEntity;
	}

	public InvoiceEntity getInvoiceEntity() {
		return invoiceEntity;
	}

	public void setInvoiceEntity(InvoiceEntity invoiceEntity) {
		this.invoiceEntity = invoiceEntity;
	}

	@Override
	public String toString() {
		return "ClaimEntity [claimId=" + claimId + ", dateOfService=" + dateOfService + ", diagnosis=" + diagnosis
				+ ", treatement=" + treatement + ", claimAmount=" + claimAmount + ", status=" + status
				+ ", submissionDate=" + submissionDate + ", approvalDate=" + approvalDate + ", patientEntity="
				+ patientEntity + ", insurancePlanEntity=" + insurancePlanEntity + ", invoiceEntity=" + invoiceEntity
				+ "]";
	}
	
	
	

}
