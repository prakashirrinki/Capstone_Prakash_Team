package com.wipro.mbcms.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mbcms.dtos.InvoiceDTO;
import com.wipro.mbcms.entities.ClaimEntity;
import com.wipro.mbcms.entities.InvoiceEntity;
import com.wipro.mbcms.entities.PatientEntity;
import com.wipro.mbcms.services.HealthCareProviderService;

@RestController
@RequestMapping("/api/healthcareprovider")
public class HealthCareProviderController {
	
	@Autowired
	HealthCareProviderService healthcareProviderService;

	public HealthCareProviderController(HealthCareProviderService healthcareProviderService) {
		super();
		this.healthcareProviderService = healthcareProviderService;
	}
	
	@PostMapping("/generate-invoice")
    public InvoiceEntity generateInvoice(@RequestBody InvoiceDTO invoiceDTO) {
        InvoiceEntity invoiceEntity = healthcareProviderService.generateInvoice(invoiceDTO);
        return invoiceEntity;
    }

	 @GetMapping("/patient/{patientId}")
	    public List<PatientEntity> getPatientDetails(@PathVariable Long patientId) {
	        List<PatientEntity> patientOptional = healthcareProviderService.getPatientByPatientId(patientId);
	        return patientOptional;
	    }
	 
	 @GetMapping("/claim/{patientId}")
	    public List<ClaimEntity> getClaimDetails(@PathVariable Long patientId) {
	        List<ClaimEntity> claimOptional = healthcareProviderService.getClaimByPatientId(patientId);
	        return claimOptional;
	    }


	
	

}
