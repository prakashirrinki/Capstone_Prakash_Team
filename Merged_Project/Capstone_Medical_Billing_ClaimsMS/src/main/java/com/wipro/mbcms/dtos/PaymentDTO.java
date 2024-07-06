package com.wipro.mbcms.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class PaymentDTO {

	private Long id;
	private String invoiceNumber;
	private LocalDate paymentDate;
	private BigDecimal amount;
	public PaymentDTO(Long id, String invoiceNumber, LocalDate paymentDate, BigDecimal amount) {
		super();
		this.id = id;
		this.invoiceNumber = invoiceNumber;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}
	public PaymentDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		return "PaymentDTO [id=" + id + ", invoiceNumber=" + invoiceNumber + ", paymentDate=" + paymentDate
				+ ", amount=" + amount + "]";
	}
	
	
}
