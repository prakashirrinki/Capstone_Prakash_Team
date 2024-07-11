package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import com.wipro.mbcms.dtos.InvoiceDTO;
import com.wipro.mbcms.entities.InvoiceEntity;


public interface InvoiceService {
	
	public InvoiceEntity addInvoice(InvoiceDTO invoiceDTO);

	public List<InvoiceEntity> getAllInvoices();

	public Optional<InvoiceEntity> getInvoiceById(Long invoiceId);


}
