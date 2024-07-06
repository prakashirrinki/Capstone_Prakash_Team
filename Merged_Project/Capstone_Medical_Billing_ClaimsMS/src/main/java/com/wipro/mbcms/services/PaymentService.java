package com.wipro.mbcms.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.wipro.mbcms.dtos.PaymentDTO;

public interface PaymentService {
	
	PaymentDTO addPayment(String invoiceNumber, LocalDate paymentDate, BigDecimal amount);

    List<PaymentDTO> getPaymentsByInvoiceNumber(String invoiceNumber);

    List<PaymentDTO> getAllPayments();

}
