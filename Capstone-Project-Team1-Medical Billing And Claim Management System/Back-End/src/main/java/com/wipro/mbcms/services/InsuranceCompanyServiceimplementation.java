package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.InsuranceCompanyDTO;
import com.wipro.mbcms.entities.InsuranceCompanyEntity;
import com.wipro.mbcms.repositories.InsuranceCompanyRepository;

@Service
public class InsuranceCompanyServiceimplementation implements InsuranceCompanyService{

	@Autowired
	InsuranceCompanyRepository insuranceCompanyRepository;
	
	@Override
	public InsuranceCompanyEntity addCompany(InsuranceCompanyDTO insuranceCompanyDTO) {
		InsuranceCompanyEntity insuranceCompanyEntity=new InsuranceCompanyEntity();
		insuranceCompanyEntity.setCompanyName(insuranceCompanyDTO.getCompanyName());
		insuranceCompanyEntity.setInsuranceCompanyEmail(insuranceCompanyDTO.getInsuranceCompanyEmail());
		insuranceCompanyEntity.setInsuranceCompanyPassword(insuranceCompanyDTO.getInsuranceCompanyPassword());
		insuranceCompanyEntity.setInsuranceCompanyContact(insuranceCompanyDTO.getInsuranceCompanyContact());
		insuranceCompanyEntity.setInsurancePlans(insuranceCompanyDTO.getInsurancePlans());
		
		return insuranceCompanyRepository.save(insuranceCompanyEntity);
	}

	@Override
	public InsuranceCompanyEntity updateCompany(InsuranceCompanyDTO insuranceCompanyDTO) {
		InsuranceCompanyEntity insuranceCompanyEntity=new InsuranceCompanyEntity();
		insuranceCompanyEntity.setInsuranceCompanyId(insuranceCompanyDTO.getInsuranceCompanyId());
		insuranceCompanyEntity.setCompanyName(insuranceCompanyDTO.getCompanyName());
		insuranceCompanyEntity.setInsuranceCompanyEmail(insuranceCompanyDTO.getInsuranceCompanyEmail());
		insuranceCompanyEntity.setInsuranceCompanyPassword(insuranceCompanyDTO.getInsuranceCompanyPassword());
		insuranceCompanyEntity.setInsuranceCompanyContact(insuranceCompanyDTO.getInsuranceCompanyContact());
		insuranceCompanyEntity.setInsurancePlans(insuranceCompanyDTO.getInsurancePlans());
		
		return insuranceCompanyRepository.save(insuranceCompanyEntity);
	}

	@Override
	public List<InsuranceCompanyEntity> getAllInsuranceCompanyDetails() {
		return insuranceCompanyRepository.findAll();
	}

	@Override
	public String deleteCompanyById(Long insuranceCompanyId) {
		insuranceCompanyRepository.deleteById(insuranceCompanyId);
		return insuranceCompanyId+" Conpany Deleted";
	}

	@Override
	public Optional<InsuranceCompanyEntity> getCompanyByName(String insuranceCompanyName) {
		return insuranceCompanyRepository.findByCompanyName(insuranceCompanyName);
	}

}
