package com.wipro.mbcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.mbcms.entities.HealthCareProviderEntity;

public class HealthCareProviderServiceImplementation implements HealthCareProviderService{
	
	@Autowired
	HealthCareProviderService healthCareProviderService;
	
	@Override
	public HealthCareProviderEntity registerProvider(HealthCareProviderEntity provider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HealthCareProviderEntity getProviderById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HealthCareProviderEntity getProviderByLicenseNumber(String licenseNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HealthCareProviderEntity> getAllProviders() {
		// TODO Auto-generated method stub
		return null;
	}

}
