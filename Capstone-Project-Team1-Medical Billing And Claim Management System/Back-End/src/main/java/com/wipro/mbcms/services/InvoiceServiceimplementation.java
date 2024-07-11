package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.InvoiceDTO;
import com.wipro.mbcms.entities.InvoiceEntity;
import com.wipro.mbcms.repositories.InvoiceRepository;


@Service
public class InvoiceServiceimplementation implements InvoiceService{

	@Autowired
	InvoiceRepository invoiceRepository;
	
	@Override
	public InvoiceEntity addInvoice(InvoiceDTO invoiceDTO) {
		InvoiceEntity invoiceEntity=new InvoiceEntity();
		
		invoiceEntity.setInvoiceId(invoiceDTO.getInvoiceId());
		invoiceEntity.setInvoiceDate(invoiceDTO.getInvoiceDate());
		invoiceEntity.setInvoiceTax(invoiceDTO.getInvoiceTax());
		invoiceEntity.setConsultationFee(invoiceDTO.getConsultationFee());
		invoiceEntity.setDiagnosticsTestsFee(invoiceDTO.getDiagnosticsTestsFee());
		invoiceEntity.setDiagnosticsScanFee(invoiceDTO.getDiagnosticsScanFee());
		invoiceEntity.setInvoiceTotalAmount(invoiceDTO.getInvoiceTotalAmount());
		invoiceEntity.setPatient(invoiceDTO.getPatient());
		
		return invoiceRepository.save(invoiceEntity);
	}

	@Override
	public List<InvoiceEntity> getAllInvoices() {
		return invoiceRepository.findAll();
	}

	@Override
	public Optional<InvoiceEntity> getInvoiceById(Long invoiceId) {
		return invoiceRepository.findById(invoiceId);
	}

}
