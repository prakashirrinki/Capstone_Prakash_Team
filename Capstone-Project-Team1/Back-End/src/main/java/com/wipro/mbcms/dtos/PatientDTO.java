package com.wipro.mbcms.dtos;

import com.wipro.mbcms.entities.InsuranceClaimsEntity;
import com.wipro.mbcms.entities.InvoiceEntity;

public class PatientDTO {

	private long patientId;
	private String patientName;
	private String patientEmail;
	private String patientPassword;
	private String patientDateOfBirth;
	private String patientGender;
	private long patientMobileNumber;
	private String patientAddress;
	private String patientSymptoms;
	private String patientTreatment;
	private InsuranceClaimsEntity insuranceClaims;
	private InvoiceEntity invoice;

	private final String role = "PATIENTS";

	

	public PatientDTO(long patientId, String patientName, String patientEmail, String patientPassword,
			String patientDateOfBirth, String patientGender, long patientMobileNumber, String patientAddress,
			String patientSymptoms, String patientTreatment, InsuranceClaimsEntity insuranceClaims,
			InvoiceEntity invoice) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientEmail = patientEmail;
		this.patientPassword = patientPassword;
		this.patientDateOfBirth = patientDateOfBirth;
		this.patientGender = patientGender;
		this.patientMobileNumber = patientMobileNumber;
		this.patientAddress = patientAddress;
		this.patientSymptoms = patientSymptoms;
		this.patientTreatment = patientTreatment;
		this.insuranceClaims = insuranceClaims;
		this.invoice = invoice;
	}

	public PatientDTO() {
		super();
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	public String getPatientDateOfBirth() {
		return patientDateOfBirth;
	}

	public void setPatientDateOfBirth(String patientDateOfBirth) {
		this.patientDateOfBirth = patientDateOfBirth;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public long getPatientMobileNumber() {
		return patientMobileNumber;
	}

	public void setPatientMobileNumber(long patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientSymptoms() {
		return patientSymptoms;
	}

	public void setPatientSymptoms(String patientSymptoms) {
		this.patientSymptoms = patientSymptoms;
	}

	public String getPatientTreatment() {
		return patientTreatment;
	}

	public void setPatientTreatment(String patientTreatment) {
		this.patientTreatment = patientTreatment;
	}

	public InsuranceClaimsEntity getInsuranceClaims() {
		return insuranceClaims;
	}

	public void setInsuranceClaims(InsuranceClaimsEntity insuranceClaims) {
		this.insuranceClaims = insuranceClaims;
	}

	public InvoiceEntity getInvoice() {
		return invoice;
	}

	public void setInvoice(InvoiceEntity invoice) {
		this.invoice = invoice;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "PatientDTO [patientId=" + patientId + ", patientName=" + patientName + ", patientEmail=" + patientEmail
				+ ", patientPassword=" + patientPassword + ", patientDateOfBirth=" + patientDateOfBirth
				+ ", patientGender=" + patientGender + ", patientMobileNumber=" + patientMobileNumber
				+ ", patientAddress=" + patientAddress + ", patientSymptoms=" + patientSymptoms + ", patientTreatment="
				+ patientTreatment + ", insuranceClaims=" + insuranceClaims + ", invoice=" + invoice + ", role=" + role
				+ "]";
	}

}
