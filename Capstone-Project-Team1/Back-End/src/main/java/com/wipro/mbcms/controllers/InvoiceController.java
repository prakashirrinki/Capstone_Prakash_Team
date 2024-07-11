package com.wipro.mbcms.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mbcms.dtos.InvoiceDTO;
import com.wipro.mbcms.entities.InvoiceEntity;
import com.wipro.mbcms.services.InvoiceService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
	
	@Autowired
	InvoiceService invoiceService;
	
	@PostMapping("/add")
	public InvoiceEntity addInvoice(@RequestBody InvoiceDTO invoiceDTO) {
		return invoiceService.addInvoice(invoiceDTO);
	}
	
	@GetMapping("/getAllInvoices")
	public List<InvoiceEntity> getAllInvoices(){
		return invoiceService.getAllInvoices();
	}
	
	@GetMapping("/getInvoiceById/{invoiceId}")
	public Optional<InvoiceEntity> getInvoiceById(@PathVariable Long invoiceId) {
		return invoiceService.getInvoiceById(invoiceId);
	}
	

}
