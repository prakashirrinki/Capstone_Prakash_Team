package com.wipro.mbcms.services;

import java.util.List;

import java.util.Optional;

import com.wipro.mbcms.dtos.InsuranceClaimsDTO;
import com.wipro.mbcms.entities.InsuranceClaimsEntity;

public interface InsuranceClaimService {
	
	public List<InsuranceClaimsEntity> getAllInsuranceClaims();

	public InsuranceClaimsEntity addClaims(InsuranceClaimsDTO insuranceClaimsDTO);

	public InsuranceClaimsEntity updateClaims(InsuranceClaimsDTO insuranceClaimsDTO);

	public Optional<InsuranceClaimsEntity> getById(long claimId);


}
