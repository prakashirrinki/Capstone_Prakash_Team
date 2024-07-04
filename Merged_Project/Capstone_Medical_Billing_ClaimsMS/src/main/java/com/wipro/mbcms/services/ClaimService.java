package com.wipro.mbcms.services;

import java.util.List;

import com.wipro.mbcms.entities.ClaimEntity;
import com.wipro.mbcms.entities.InsurancePlanEntity;
import com.wipro.mbcms.entities.PatientEntity;

public interface ClaimService {
	
	public ClaimEntity submitClaim(ClaimEntity claim);
	 public ClaimEntity getClaimById(Long id);
	 public List<ClaimEntity> getClaimsByPatient(PatientEntity patient);
	 public List<ClaimEntity> getClaimsByInsurancePlan(InsurancePlanEntity plan);
	 public ClaimEntity processClaimReview(Long id, String status);
	 public List<ClaimEntity> getClaimsByStatus(String status);

}
