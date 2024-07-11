package com.wipro.mbcms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

@Entity
public class InvoiceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invoiceSequence")
	@SequenceGenerator(name = "invoiceSequence", initialValue = 100000)
	private long invoiceId;
	private String invoiceDate;
	@NotNull
	private double invoiceTax;
	@DecimalMax(value = "5000")
	@DecimalMin(value = "1000")
	private double consultationFee;
	private double diagnosticsTestsFee;
	private double diagnosticsScanFee;
	private double invoiceTotalAmount;
	private double totalBillAmount;
	@OneToOne
	@JoinColumn(name = "patientId")
	private PatientEntity patient;
	public InvoiceEntity(long invoiceId, String invoiceDate, @NotNull double invoiceTax,
			@DecimalMax("5000") @DecimalMin("1000") double consultationFee, double diagnosticsTestsFee,
			double diagnosticsScanFee, double invoiceTotalAmount, double totalBillAmount, PatientEntity patient) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.invoiceTax = invoiceTax;
		this.consultationFee = consultationFee;
		this.diagnosticsTestsFee = diagnosticsTestsFee;
		this.diagnosticsScanFee = diagnosticsScanFee;
		this.invoiceTotalAmount = invoiceTotalAmount;
		this.totalBillAmount = totalBillAmount;
		this.patient = patient;
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
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public double getInvoiceTax() {
		return invoiceTax;
	}
	public void setInvoiceTax(double invoiceTax) {
		this.invoiceTax = invoiceTax;
	}
	public double getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	public double getDiagnosticsTestsFee() {
		return diagnosticsTestsFee;
	}
	public void setDiagnosticsTestsFee(double diagnosticsTestsFee) {
		this.diagnosticsTestsFee = diagnosticsTestsFee;
	}
	public double getDiagnosticsScanFee() {
		return diagnosticsScanFee;
	}
	public void setDiagnosticsScanFee(double diagnosticsScanFee) {
		this.diagnosticsScanFee = diagnosticsScanFee;
	}
	public double getInvoiceTotalAmount() {
		return invoiceTotalAmount;
	}
	public void setInvoiceTotalAmount(double invoiceTotalAmount) {
		this.invoiceTotalAmount = invoiceTotalAmount;
	}
	public double getTotalBillAmount() {
		return totalBillAmount;
	}
	public void setTotalBillAmount(double totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	public PatientEntity getPatient() {
		return patient;
	}
	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "InvoiceEntity [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", invoiceTax=" + invoiceTax
				+ ", consultationFee=" + consultationFee + ", diagnosticsTestsFee=" + diagnosticsTestsFee
				+ ", diagnosticsScanFee=" + diagnosticsScanFee + ", invoiceTotalAmount=" + invoiceTotalAmount
				+ ", totalBillAmount=" + totalBillAmount + ", patient=" + patient + "]";
	}
	
	

}
