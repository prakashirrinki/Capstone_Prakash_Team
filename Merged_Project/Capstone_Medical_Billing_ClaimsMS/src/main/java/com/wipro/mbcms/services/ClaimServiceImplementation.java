package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.entities.ClaimEntity;
import com.wipro.mbcms.repositories.ClaimRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ClaimServiceImplementation implements ClaimService{
	
	@Autowired
	ClaimRepository claimRepository;

	@Override
	public ClaimEntity submitClaim(ClaimEntity claim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ClaimEntity> getClaimById(Long claimId) {
		
		return claimRepository.findById(claimId);
	}

	@Override
	public List<ClaimEntity> getClaimsByPatient(Long patientId) {
		
		return claimRepository.findByPatientId(patientId);
	}

}
