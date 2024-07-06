package com.wipro.mbcms.services;

import java.util.List;


import com.wipro.mbcms.entities.HealthCareProviderEntity;
import com.wipro.mbcms.entities.InvoiceEntity;
import com.wipro.mbcms.entities.PatientEntity;

public interface InvoiceService {
	
	public InvoiceEntity generateInvoice(InvoiceEntity invoice);
	public InvoiceEntity getInvoiceById(Long id);
	public List<InvoiceEntity> getInvoicesByPatient(PatientEntity patient);
	public List<InvoiceEntity> getInvoicesByHealthcareProvider(HealthCareProviderEntity provider);
	 public InvoiceEntity updateInvoiceStatus(Long id, String status);

}
