package com.wipro.mbcms.dtos;

import com.wipro.mbcms.entities.PatientEntity;

public class InvoiceDTO {
	
	private long invoiceId;
	private String invoiceDate;
	private double invoiceTax;
	private double consultationFee;
	private double diagnosticsTestsFee;
	private double diagnosticsScanFee;
	private double invoiceTotalAmount;
	private double totalBillAmount;
	private PatientEntity patient;
	public InvoiceDTO(long invoiceId, String invoiceDate, double invoiceTax, double consultationFee,
			double diagnosticsTestsFee, double diagnosticsScanFee, double invoiceTotalAmount, double totalBillAmount,
			PatientEntity patient) {
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
	public InvoiceDTO() {
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
		return "InvoiceDTO [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", invoiceTax=" + invoiceTax
				+ ", consultationFee=" + consultationFee + ", diagnosticsTestsFee=" + diagnosticsTestsFee
				+ ", diagnosticsScanFee=" + diagnosticsScanFee + ", invoiceTotalAmount=" + invoiceTotalAmount
				+ ", totalBillAmount=" + totalBillAmount + ", patient=" + patient + "]";
	}
	
	

}
