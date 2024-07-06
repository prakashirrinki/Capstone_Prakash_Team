package com.wipro.mbcms.services;

import java.util.List;

import java.util.Optional;

import com.wipro.mbcms.entities.ClaimEntity;

public interface ClaimService {
	
	public ClaimEntity submitClaim(ClaimEntity claim);
	 public Optional<ClaimEntity> getClaimById(Long id);
	 public List<ClaimEntity> getClaimsByPatient(Long patientId);
}
