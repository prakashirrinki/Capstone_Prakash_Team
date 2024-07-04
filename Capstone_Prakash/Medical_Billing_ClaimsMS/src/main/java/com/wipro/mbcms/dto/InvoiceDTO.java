package com.wipro.mbcms.dto;

import java.util.Date;

public class InvoiceDTO {

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

	public InvoiceDTO(long invoiceId, String invoiceNumber, Date dueDate, double consultationFee,
			double diagnosticTestFee, double diagnosticScanFee, double medicationBillAmount, double tax,
			double totleDueAmount, String status) {
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

	@Override
	public String toString() {
		return "InvoiceDTO [invoiceId=" + invoiceId + ", invoiceNumber=" + invoiceNumber + ", dueDate=" + dueDate
				+ ", consultationFee=" + consultationFee + ", diagnosticTestFee=" + diagnosticTestFee
				+ ", diagnosticScanFee=" + diagnosticScanFee + ", medicationBillAmount=" + medicationBillAmount
				+ ", tax=" + tax + ", totleDueAmount=" + totleDueAmount + ", status=" + status + "]";
	}

}
