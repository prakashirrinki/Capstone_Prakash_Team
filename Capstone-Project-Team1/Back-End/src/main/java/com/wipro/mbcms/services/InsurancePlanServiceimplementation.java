package com.wipro.mbcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.InsurancePlansDTO;
import com.wipro.mbcms.entities.InsurancePlansEntity;
import com.wipro.mbcms.repositories.InsurancePlansRepository;

@Service
public class InsurancePlanServiceimplementation implements InsurancePlanService{

	@Autowired
	InsurancePlansRepository insurancePlansRepository;
	
	@Override
	public InsurancePlansEntity addInsurancePlan(InsurancePlansDTO insurancePlanDTO) {
		InsurancePlansEntity insurancePlansEntity=new  InsurancePlansEntity();
		insurancePlansEntity.setInsurancePlanId(insurancePlanDTO.getInsurancePlanId());
		insurancePlansEntity.setInsurancePlanName(insurancePlanDTO.getInsurancePlanName());
		insurancePlansEntity.setInsurancePlanType(insurancePlanDTO.getInsurancePlanType());
		insurancePlansEntity.setInsurancePlanCoverAmount(insurancePlanDTO.getInsurancePlanCoverAmount());
		insurancePlansEntity.setInsurancePlanDetails(insurancePlanDTO.getInsurancePlanDetails());
		insurancePlansEntity.setInsuranceCompany(insurancePlanDTO.getInsuranceCompany());
		insurancePlansEntity.setInsuranceCompanyName(insurancePlanDTO.getInsuranceCompanyName());
		return insurancePlansRepository.save(insurancePlansEntity);
	}

	@Override
	public InsurancePlansEntity updateInsurancePlans(InsurancePlansDTO insurancePlanDTO) {
		InsurancePlansEntity insurancePlansEntity=new  InsurancePlansEntity();
		insurancePlansEntity.setInsurancePlanId(insurancePlanDTO.getInsurancePlanId());
		insurancePlansEntity.setInsurancePlanName(insurancePlanDTO.getInsurancePlanName());
		insurancePlansEntity.setInsurancePlanType(insurancePlanDTO.getInsurancePlanType());
		insurancePlansEntity.setInsurancePlanCoverAmount(insurancePlanDTO.getInsurancePlanCoverAmount());
		insurancePlansEntity.setInsurancePlanDetails(insurancePlanDTO.getInsurancePlanDetails());
		insurancePlansEntity.setInsuranceCompany(insurancePlanDTO.getInsuranceCompany());
		insurancePlansEntity.setInsuranceCompanyName(insurancePlanDTO.getInsuranceCompanyName());
		return insurancePlansRepository.save(insurancePlansEntity);
	}

	@Override
	public String deleteInsurancePlan(Long insurancePlanId) {
		insurancePlansRepository.deleteById(insurancePlanId);
		return insurancePlanId+" Insurance Plan Deleted";
		
	}

	@Override
	public List<InsurancePlansEntity> getAllPlans() {
		return insurancePlansRepository.findAll();
	}
}
