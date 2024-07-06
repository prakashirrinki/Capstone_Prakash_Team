package com.wipro.mbcms.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class PaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long paymentId;
	private String invoiceNumber;
	private LocalDate paymentDate;
	private BigDecimal amount;
	public PaymentEntity(Long paymentId, String invoiceNumber, LocalDate paymentDate, BigDecimal amount) {
		super();
		this.paymentId = paymentId;
		this.invoiceNumber = invoiceNumber;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}
	public PaymentEntity() {
		super();
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "PaymentEntity [paymentId=" + paymentId + ", invoiceNumber=" + invoiceNumber + ", paymentDate=" + paymentDate
				+ ", amount=" + amount + "]";
	}
	
	
}
