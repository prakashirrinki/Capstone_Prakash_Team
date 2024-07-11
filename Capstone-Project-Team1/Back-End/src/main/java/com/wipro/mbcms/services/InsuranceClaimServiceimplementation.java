package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.InsuranceClaimsDTO;
import com.wipro.mbcms.entities.InsuranceClaimsEntity;
import com.wipro.mbcms.repositories.InsuranceClaimsRepository;

@Service
public class InsuranceClaimServiceimplementation implements InsuranceClaimService{

	
	@Autowired
	InsuranceClaimsRepository insuranceClaimsRepository;
	
	@Override
	public List<InsuranceClaimsEntity> getAllInsuranceClaims() {
		return insuranceClaimsRepository.findAll();
	}

	@Override
	public InsuranceClaimsEntity addClaims(InsuranceClaimsDTO insuranceClaimsDTO) {
		InsuranceClaimsEntity insuranceClaimsEntity=new InsuranceClaimsEntity();
		insuranceClaimsEntity.setInsuranceClaimId(insuranceClaimsDTO.getInsuranceClaimId());
		insuranceClaimsEntity.setInsuranceClaimAmount(insuranceClaimsDTO.getInsuranceClaimAmount());
		insuranceClaimsEntity.setInsuranceClaimStatus(insuranceClaimsDTO.getInsuranceClaimStatus());
		insuranceClaimsEntity.setInvoiceAmount(insuranceClaimsDTO.getInvoiceAmount());
		insuranceClaimsEntity.setPatient(insuranceClaimsDTO.getPatient());
		insuranceClaimsEntity.setInsurancePlans(insuranceClaimsDTO.getInsurancePlans());
		
		return insuranceClaimsRepository.save(insuranceClaimsEntity);
	}

	@Override
	public InsuranceClaimsEntity updateClaims(InsuranceClaimsDTO insuranceClaimsDTO) {
		InsuranceClaimsEntity insuranceClaimsEntity=new InsuranceClaimsEntity();
		insuranceClaimsEntity.setInsuranceClaimId(insuranceClaimsDTO.getInsuranceClaimId());
		insuranceClaimsEntity.setInsuranceClaimAmount(insuranceClaimsDTO.getInsuranceClaimAmount());
		insuranceClaimsEntity.setInsuranceClaimStatus(insuranceClaimsDTO.getInsuranceClaimStatus());
		insuranceClaimsEntity.setInvoiceAmount(insuranceClaimsDTO.getInvoiceAmount());
		insuranceClaimsEntity.setPatient(insuranceClaimsDTO.getPatient());
		insuranceClaimsEntity.setInsurancePlans(insuranceClaimsDTO.getInsurancePlans());
		
		return insuranceClaimsRepository.save(insuranceClaimsEntity);
	}

	@Override
	public Optional<InsuranceClaimsEntity> getById(long claimId) {
		return insuranceClaimsRepository.findById(claimId);
	}

}
