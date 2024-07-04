package com.wipro.mbcms.dtos;

import java.util.Date;

public class ClaimDTO {

	private long claimId;
	private Date dateOfService;
	private String diagnosis;
	private String treatement;
	private double claimAmount;
	private String status;
	private Date submissionDate;
	private Date approvalDate;

	public ClaimDTO(long claimId, Date dateOfService, String diagnosis, String treatement, double claimAmount,
			String status, Date submissionDate, Date approvalDate) {
		super();
		this.claimId = claimId;
		this.dateOfService = dateOfService;
		this.diagnosis = diagnosis;
		this.treatement = treatement;
		this.claimAmount = claimAmount;
		this.status = status;
		this.submissionDate = submissionDate;
		this.approvalDate = approvalDate;
	}

	public ClaimDTO() {
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

	@Override
	public String toString() {
		return "ClaimDTO [claimId=" + claimId + ", dateOfService=" + dateOfService + ", diagnosis=" + diagnosis
				+ ", treatement=" + treatement + ", claimAmount=" + claimAmount + ", status=" + status
				+ ", submissionDate=" + submissionDate + ", approvalDate=" + approvalDate + "]";
	}

}
