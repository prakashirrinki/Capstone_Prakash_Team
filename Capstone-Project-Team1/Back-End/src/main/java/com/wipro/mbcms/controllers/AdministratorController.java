package com.wipro.mbcms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mbcms.dtos.AdministratorDTO;
import com.wipro.mbcms.entities.AdministratorEntity;
import com.wipro.mbcms.entities.HealthCareProviderEntity;
import com.wipro.mbcms.entities.InsuranceCompanyEntity;
import com.wipro.mbcms.entities.PatientEntity;
import com.wipro.mbcms.services.AdministratorService;
import com.wipro.mbcms.services.HealthCareProviderService;
import com.wipro.mbcms.services.InsuranceClaimService;
import com.wipro.mbcms.services.InsuranceCompanyService;
import com.wipro.mbcms.services.PatientService;



/*
 * Auther Name = Prakash Manikanta Irrinki
 * 
 * Module : Administrator
 * 
 * Description : It is used to monitor all the other modules
 * 
 * */


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/admin")
public class AdministratorController {

	@Autowired
	AdministratorService administratorService;

	@Autowired
	HealthCareProviderService healthCareProviderService;

	@Autowired
	PatientService patientService;
	
	@Autowired
	InsuranceCompanyService insuranceCompanyService;
	
	@Autowired
	InsuranceClaimService insuranceClaimService;

	@PostMapping("/add")
	public AdministratorEntity addAdmin(@RequestBody AdministratorDTO administratorDTO) {
		return administratorService.addAdmin(administratorDTO);
	}
	
	@GetMapping("/getAll")
	public 	List<AdministratorEntity> getAll() {
		
		return administratorService.getAll();
		
	}

	@PutMapping("/update")
	public AdministratorEntity updateAdmin(@RequestBody AdministratorDTO administratorDTO) {
		return administratorService.updateAdmin(administratorDTO);
	}

	@GetMapping("/getAllPatients")
	public List<PatientEntity> getAllPatients() {
		return patientService.getAllPatients();
	}

	@GetMapping("/getAllProviders")
	public List<HealthCareProviderEntity> getAllProviders() {
		return healthCareProviderService.getAllProviders();
	}
	
	@GetMapping("/getAllCompanies")
	public List<InsuranceCompanyEntity> getAllCompanies(){
		return insuranceCompanyService.getAllInsuranceCompanyDetails();
		}
	

//	@PostMapping("/authenticate")
//	public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
//
//		Authentication authentication = authenticationManager.authenticate(
//				new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
//		String token = null;
//		if (authentication.isAuthenticated()) {
//			token = jwtService.generateToken(authRequest.getUserName());
//		} else {
//			throw new UsernameNotFoundException("UserName or Password in Invalid / Invalid Request");
//		}
//		return token;
//
//	}

}
