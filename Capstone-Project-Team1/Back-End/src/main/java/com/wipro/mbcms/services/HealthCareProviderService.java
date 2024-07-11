package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import com.wipro.mbcms.dtos.HealthCareProviderDTO;
import com.wipro.mbcms.entities.HealthCareProviderEntity;

public interface HealthCareProviderService {
	
	public HealthCareProviderEntity addProvider(HealthCareProviderDTO healthCareProviderDTO);

	public HealthCareProviderEntity updateProvider(HealthCareProviderDTO healthCareProviderDTO);

	public List<HealthCareProviderEntity> getAllProviders();

	public Optional<HealthCareProviderEntity> getProviderById(Long providerId);

	public String deleteProviderById(Long providerId);


}
