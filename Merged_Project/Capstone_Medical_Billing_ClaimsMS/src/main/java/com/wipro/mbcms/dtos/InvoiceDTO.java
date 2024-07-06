package com.wipro.mbcms.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class InvoiceDTO {

	private Long invoiceId;
	private LocalDate invoiceDate;
	private LocalDate dueDate;
	private String patientId;
	private String patientName;
	private String patientAddress;
	private BigDecimal consultationFee;
	private BigDecimal diagnosticTestsFee;
	private BigDecimal diagnosticScanFee;
	private BigDecimal prescribedMedicationsAmount;
	private double taxRate;
	private BigDecimal totalDueAmount;

	public InvoiceDTO(Long invoiceId, LocalDate invoiceDate, LocalDate dueDate, String patientId,
			String patientName, String patientAddress, BigDecimal consultationFee, BigDecimal diagnosticTestsFee,
			BigDecimal diagnosticScanFee, BigDecimal prescribedMedicationsAmount, double taxRate,
			BigDecimal totalDueAmount) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.dueDate = dueDate;
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.consultationFee = consultationFee;
		this.diagnosticTestsFee = diagnosticTestsFee;
		this.diagnosticScanFee = diagnosticScanFee;
		this.prescribedMedicationsAmount = prescribedMedicationsAmount;
		this.taxRate = taxRate;
		this.totalDueAmount = totalDueAmount;
	}

	public InvoiceDTO() {
		super();
	}

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public BigDecimal getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(BigDecimal consultationFee) {
		this.consultationFee = consultationFee;
	}

	public BigDecimal getDiagnosticTestsFee() {
		return diagnosticTestsFee;
	}

	public void setDiagnosticTestsFee(BigDecimal diagnosticTestsFee) {
		this.diagnosticTestsFee = diagnosticTestsFee;
	}

	public BigDecimal getDiagnosticScanFee() {
		return diagnosticScanFee;
	}

	public void setDiagnosticScanFee(BigDecimal diagnosticScanFee) {
		this.diagnosticScanFee = diagnosticScanFee;
	}

	public BigDecimal getPrescribedMedicationsAmount() {
		return prescribedMedicationsAmount;
	}

	public void setPrescribedMedicationsAmount(BigDecimal prescribedMedicationsAmount) {
		this.prescribedMedicationsAmount = prescribedMedicationsAmount;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public BigDecimal getTotalDueAmount() {
		return totalDueAmount;
	}

	public void setTotalDueAmount(BigDecimal totalDueAmount) {
		this.totalDueAmount = totalDueAmount;
	}

	@Override
	public String toString() {
		return "InvoiceEntity [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", dueDate=" + dueDate
				+ ", patientId=" + patientId + ", patientName=" + patientName + ", patientAddress=" + patientAddress
				+ ", consultationFee=" + consultationFee + ", diagnosticTestsFee=" + diagnosticTestsFee
				+ ", diagnosticScanFee=" + diagnosticScanFee + ", prescribedMedicationsAmount="
				+ prescribedMedicationsAmount + ", taxRate=" + taxRate + ", totalDueAmount=" + totalDueAmount + "]";
	}

	

}
