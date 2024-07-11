package com.wipro.mbcms.controllers;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mbcms.dtos.InsuranceClaimsDTO;
import com.wipro.mbcms.entities.InsuranceClaimsEntity;
import com.wipro.mbcms.services.InsuranceClaimService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/claims")
public class InsuranceClaimController {
	
	@Autowired
	InsuranceClaimService claimService;

	@GetMapping("/getallclaims")
	public List<InsuranceClaimsEntity> getAllClaims() {
		return claimService.getAllInsuranceClaims();

	}

	@PostMapping("/add")
	public InsuranceClaimsEntity insertNewClaim(@RequestBody InsuranceClaimsDTO claimDTO) {
		return claimService.addClaims(claimDTO);
	}

	@PutMapping("/update/claim/{claimId}")
	public InsuranceClaimsEntity updateStatus(@RequestBody InsuranceClaimsDTO claimDTO) {
		return claimService.updateClaims(claimDTO);
	}

	@GetMapping("/getClaims/{claimId}")
	public Optional<InsuranceClaimsEntity> getClaimById(@PathVariable Long claimId) {
		return claimService.getById(claimId);
	}

}
