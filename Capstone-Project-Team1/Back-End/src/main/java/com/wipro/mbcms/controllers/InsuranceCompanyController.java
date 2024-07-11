package com.wipro.mbcms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mbcms.dtos.InsuranceCompanyDTO;
import com.wipro.mbcms.entities.InsuranceCompanyEntity;
import com.wipro.mbcms.services.InsuranceCompanyService;

/*
 * Auther Name = Maddula Rupa Sri Manohar
 * 
 * Module : InsuranceCompany
 * 
 * Description : It is used to check the insurance plans and approve the insurance.
 * 
 * */
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/company")
public class InsuranceCompanyController {
	
	@Autowired
	InsuranceCompanyService service;
	
	@PostMapping("/add")
	public InsuranceCompanyEntity addCompany(@RequestBody InsuranceCompanyDTO companyDTO) {
		return service.addCompany(companyDTO);
	}
	
	@PutMapping("/update")
	public InsuranceCompanyEntity updateCompany(@RequestBody InsuranceCompanyDTO companyDTO) {
		return service.updateCompany(companyDTO);
	}

	@DeleteMapping("/delete/{companyId}")
	public String deleteExistingCompany(@PathVariable Long companyId) {
		service.deleteCompanyById(companyId);
		return "Insurance Company with id " + companyId + " is deleted";
	}
	@GetMapping("/getallcompaniesdata")
	public List<InsuranceCompanyEntity> getAllInsuranceCompanies() {
		return service.getAllInsuranceCompanyDetails();
	}
}
