package com.wipro.mbcms.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.PaymentDTO;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class PaymentServiceImplementation implements PaymentService{

	@Override
	public PaymentDTO addPayment(String invoiceNumber, LocalDate paymentDate, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PaymentDTO> getPaymentsByInvoiceNumber(String invoiceNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PaymentDTO> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

}
