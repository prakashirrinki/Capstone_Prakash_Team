package com.wipro.mbcms.services;

import java.util.List;

import com.wipro.mbcms.dtos.InsurancePlansDTO;
import com.wipro.mbcms.entities.InsurancePlansEntity;

public interface InsurancePlanService {
	
	 public InsurancePlansEntity addInsurancePlan(InsurancePlansDTO insurancePlansDTO);
		
		public InsurancePlansEntity updateInsurancePlans(InsurancePlansDTO insurancePlansDTO);
		 
		public String deleteInsurancePlan(Long insurancePlansId);
		
		public List<InsurancePlansEntity> getAllPlans();


}
