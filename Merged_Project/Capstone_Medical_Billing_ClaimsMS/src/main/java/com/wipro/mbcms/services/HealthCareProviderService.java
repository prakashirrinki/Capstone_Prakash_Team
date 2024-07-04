package com.wipro.mbcms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.mbcms.entities.HealthCareProviderEntity;

@Service
public interface HealthCareProviderService {
	
	 public HealthCareProviderEntity registerProvider(HealthCareProviderEntity provider);
	 public HealthCareProviderEntity getProviderById(Long id);
	 public HealthCareProviderEntity getProviderByLicenseNumber(String licenseNumber);
	 public List<HealthCareProviderEntity> getAllProviders();

}
