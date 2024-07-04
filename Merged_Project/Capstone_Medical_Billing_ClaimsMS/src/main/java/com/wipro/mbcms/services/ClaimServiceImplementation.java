package com.wipro.mbcms.services;

import java.util.List;

import com.wipro.mbcms.entities.ClaimEntity;
import com.wipro.mbcms.entities.InsurancePlanEntity;
import com.wipro.mbcms.entities.PatientEntity;

public class ClaimServiceImplementation implements ClaimService{

	@Override
	public ClaimEntity submitClaim(ClaimEntity claim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaimEntity getClaimById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClaimEntity> getClaimsByPatient(PatientEntity patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClaimEntity> getClaimsByInsurancePlan(InsurancePlanEntity plan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaimEntity processClaimReview(Long id, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClaimEntity> getClaimsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
