package com.wipro.mbcms.services;

import java.util.List;



import com.wipro.mbcms.dtos.InvoiceDTO;
import com.wipro.mbcms.entities.ClaimEntity;
import com.wipro.mbcms.entities.InvoiceEntity;
import com.wipro.mbcms.entities.PatientEntity;

public interface HealthCareProviderService {
	
	InvoiceEntity generateInvoice(InvoiceDTO invoiceDTO);

    List<PatientEntity> getPatientByPatientId(Long patientId);

    List<ClaimEntity> getClaimByPatientId(Long patientId);

}
