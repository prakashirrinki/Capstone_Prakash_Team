package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import com.wipro.mbcms.dtos.InsuranceCompanyDTO;
import com.wipro.mbcms.entities.InsuranceCompanyEntity;

public interface InsuranceCompanyService {
	
	public InsuranceCompanyEntity addCompany(InsuranceCompanyDTO insuranceCompanyDTO);

	public InsuranceCompanyEntity updateCompany(InsuranceCompanyDTO insuranceCompanyDTO);

	public List<InsuranceCompanyEntity> getAllInsuranceCompanyDetails();

	public String deleteCompanyById(Long companyId);

	public Optional<InsuranceCompanyEntity> getCompanyByName(String insuranceCompanyName);


}
