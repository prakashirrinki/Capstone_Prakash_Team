package com.wipro.mbcms.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.InvoiceDTO;
import com.wipro.mbcms.entities.ClaimEntity;
import com.wipro.mbcms.entities.InvoiceEntity;
import com.wipro.mbcms.entities.PatientEntity;
import com.wipro.mbcms.repositories.ClaimRepository;
import com.wipro.mbcms.repositories.InvoiceRepository;
import com.wipro.mbcms.repositories.PatientRepository;

@Service
@Configuration
public class HealthCareProviderServiceImplementation implements HealthCareProviderService{
	
	@Autowired
	InvoiceEntity invoiceEntity;
	
	@Autowired
	InvoiceRepository invoiceRepository;

	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	ClaimRepository claimRepository;

	@Bean
	@Override
	public InvoiceEntity generateInvoice(InvoiceDTO invoiceDTO) {
		invoiceEntity.setInvoiceId(invoiceDTO.getInvoiceId());
        invoiceEntity.setInvoiceDate(invoiceDTO.getInvoiceDate());
        invoiceEntity.setDueDate(invoiceDTO.getDueDate());
        invoiceEntity.setPatientId(invoiceDTO.getPatientId());
        invoiceEntity.setPatientName(invoiceDTO.getPatientName());
        invoiceEntity.setPatientAddress(invoiceDTO.getPatientAddress());
        invoiceEntity.setConsultationFee(invoiceDTO.getConsultationFee());
        invoiceEntity.setDiagnosticTestsFee(invoiceDTO.getDiagnosticTestsFee());
        invoiceEntity.setDiagnosticScanFee(invoiceDTO.getDiagnosticScanFee());
        invoiceEntity.setPrescribedMedicationsAmount(invoiceDTO.getPrescribedMedicationsAmount());
        invoiceEntity.setTaxRate(invoiceDTO.getTaxRate());
        
		/*
		 * BigDecimal billAmount = invoiceDTO.getConsultationFee()
		 * .add(invoiceDTO.getDiagnosticTestsFee())
		 * .add(invoiceDTO.getDiagnosticScanFee())
		 * .add(invoiceDTO.getPrescribedMedicationsAmount());
		 * 
		 * BigDecimal taxAmount =
		 * billAmount.multiply(BigDecimal.valueOf(invoiceDTO.getTaxRate() / 100));
		 * invoiceEntity.setTotalDueAmount(billAmount.add(taxAmount));
		 */
		return invoiceRepository.save(invoiceEntity);
	}

	@Override
	public List<PatientEntity> getPatientByPatientId(Long patientId) {
		
		return patientRepository.findByPatientId(patientId);
	}

	@Override
	public List<ClaimEntity> getClaimByPatientId(Long patientId) {
		
		return claimRepository.findByPatientId(patientId);
	}
	
	

}
