package com.wipro.mbcms.services;

import java.util.List;

import com.wipro.mbcms.entities.InsuranceCompanyEntity;

public interface InsuranceCompanyService {
	
	public InsuranceCompanyEntity registerCompany(InsuranceCompanyEntity company);
	public InsuranceCompanyEntity getCompanyById(Long id);
	public InsuranceCompanyEntity getCompanyByName(String name);
	public List<InsuranceCompanyEntity> getAllCompanies();
	

}
