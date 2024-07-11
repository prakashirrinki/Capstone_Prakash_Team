package com.wipro.mbcms.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class PatientEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long patientId;
	@NotBlank
	private String patientName;
	@Email
	private String patientEmail;
//	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Letter must be 5")
	private String patientPassword;
	private String patientDateOfBirth;
	@NotBlank
	private String patientGender;
	private long patientMobileNumber;
	private String patientAddress;
	@NotBlank
	private String patientSymptoms;
	private String patientTreatment;
	@OneToOne( cascade = CascadeType.ALL)
	 private InsuranceClaimsEntity insuranceClaims;
	@OneToOne( cascade = CascadeType.ALL)
	private InvoiceEntity invoice;

	private final String role = "PATIENTS";

	public PatientEntity(long patientId, @NotBlank String patientName, @Email String patientEmail,
			@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Letter must be 5") String patientPassword,
			String patientDateOfBirth, @NotBlank String patientGender, long patientMobileNumber, String patientAddress,
			@NotBlank String patientSymptoms, String patientTreatment, InsuranceClaimsEntity insuranceClaims,
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

	public PatientEntity() {
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
		return "PatientEntity [patientId=" + patientId + ", patientName=" + patientName + ", patientEmail="
				+ patientEmail + ", patientPassword=" + patientPassword + ", patientDateOfBirth=" + patientDateOfBirth
				+ ", patientGender=" + patientGender + ", patientMobileNumber=" + patientMobileNumber
				+ ", patientAddress=" + patientAddress + ", patientSymptoms=" + patientSymptoms + ", patientTreatment="
				+ patientTreatment + ", insuranceClaims=" + insuranceClaims + ", invoice=" + invoice + ", role=" + role
				+ "]";
	}
	



}
