package com.wipro.mbcms.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InvoiceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long invoiceId;
	private String invoiceNumber;
	private Date dueDate;
	private double consultationFee;
	private double diagnosticTestFee;
	private double diagnosticScanFee;
	private double medicationBillAmount;
	private double tax;
	private double totleDueAmount;
	private String status;

	private PatientEntity patientEntity;
	private HealthCareProviderEntity healthCareProviderEntity;

	public InvoiceEntity(long invoiceId, String invoiceNumber, Date dueDate, double consultationFee,
			double diagnosticTestFee, double diagnosticScanFee, double medicationBillAmount, double tax,
			double totleDueAmount, String status, PatientEntity patientEntity,
			HealthCareProviderEntity healthCareProviderEntity) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceNumber = invoiceNumber;
		this.dueDate = dueDate;
		this.consultationFee = consultationFee;
		this.diagnosticTestFee = diagnosticTestFee;
		this.diagnosticScanFee = diagnosticScanFee;
		this.medicationBillAmount = medicationBillAmount;
		this.tax = tax;
		this.totleDueAmount = totleDueAmount;
		this.status = status;
		this.patientEntity = patientEntity;
		this.healthCareProviderEntity = healthCareProviderEntity;
	}

	public InvoiceEntity() {
		super();
	}

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	public double getDiagnosticTestFee() {
		return diagnosticTestFee;
	}

	public void setDiagnosticTestFee(double diagnosticTestFee) {
		this.diagnosticTestFee = diagnosticTestFee;
	}

	public double getDiagnosticScanFee() {
		return diagnosticScanFee;
	}

	public void setDiagnosticScanFee(double diagnosticScanFee) {
		this.diagnosticScanFee = diagnosticScanFee;
	}

	public double getMedicationBillAmount() {
		return medicationBillAmount;
	}

	public void setMedicationBillAmount(double medicationBillAmount) {
		this.medicationBillAmount = medicationBillAmount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotleDueAmount() {
		return totleDueAmount;
	}

	public void setTotleDueAmount(double totleDueAmount) {
		this.totleDueAmount = totleDueAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PatientEntity getPatientEntity() {
		return patientEntity;
	}

	public void setPatientEntity(PatientEntity patientEntity) {
		this.patientEntity = patientEntity;
	}

	public HealthCareProviderEntity getHealthCareProviderEntity() {
		return healthCareProviderEntity;
	}

	public void setHealthCareProviderEntity(HealthCareProviderEntity healthCareProviderEntity) {
		this.healthCareProviderEntity = healthCareProviderEntity;
	}

	@Override
	public String toString() {
		return "InvoiceEntity [invoiceId=" + invoiceId + ", invoiceNumber=" + invoiceNumber + ", dueDate=" + dueDate
				+ ", consultationFee=" + consultationFee + ", diagnosticTestFee=" + diagnosticTestFee
				+ ", diagnosticScanFee=" + diagnosticScanFee + ", medicationBillAmount=" + medicationBillAmount
				+ ", tax=" + tax + ", totleDueAmount=" + totleDueAmount + ", status=" + status + ", patientEntity="
				+ patientEntity + ", healthCareProviderEntity=" + healthCareProviderEntity + "]";
	}

}
