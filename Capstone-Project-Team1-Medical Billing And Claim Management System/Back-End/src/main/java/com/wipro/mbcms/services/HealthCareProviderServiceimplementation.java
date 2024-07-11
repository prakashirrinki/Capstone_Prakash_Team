package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.HealthCareProviderDTO;
import com.wipro.mbcms.entities.HealthCareProviderEntity;
import com.wipro.mbcms.repositories.HealthCareProviderRepository;

@Service
public class HealthCareProviderServiceimplementation implements HealthCareProviderService{

	@Autowired
	HealthCareProviderRepository healthCareProviderRepository;
	

	@Override
	public HealthCareProviderEntity addProvider(HealthCareProviderDTO healthCareProviderDTO) {
		HealthCareProviderEntity healthCareProviderEntity=new HealthCareProviderEntity();
		healthCareProviderEntity.setProviderName(healthCareProviderDTO.getProviderName());
		healthCareProviderEntity.setHealthCareProviderEmail(healthCareProviderDTO.getHealthCareProviderEmail());
		healthCareProviderEntity.setHealthCareProviderPassword((healthCareProviderDTO.getHealthCareProviderPassword()));
		healthCareProviderEntity.setHealthCareProviderSpeciality(healthCareProviderDTO.getHealthCareProviderSpeciality());
		
		return healthCareProviderRepository.save(healthCareProviderEntity);
	}

	@Override
	public HealthCareProviderEntity updateProvider(HealthCareProviderDTO healthCareProviderDTO) {
		HealthCareProviderEntity healthCareProviderEntity=new HealthCareProviderEntity();
		healthCareProviderEntity.setHealthCareProviderId(healthCareProviderDTO.getHealthCareProviderId());
		healthCareProviderEntity.setProviderName(healthCareProviderDTO.getProviderName());
		healthCareProviderEntity.setHealthCareProviderEmail(healthCareProviderDTO.getHealthCareProviderEmail());
		healthCareProviderEntity.setHealthCareProviderPassword(healthCareProviderDTO.getHealthCareProviderPassword());
		healthCareProviderEntity.setHealthCareProviderSpeciality(healthCareProviderDTO.getHealthCareProviderSpeciality());
		
		return healthCareProviderRepository.save(healthCareProviderEntity);
	}

	@Override
	public List<HealthCareProviderEntity> getAllProviders() {
		return healthCareProviderRepository.findAll();
	}

	@Override
	public Optional<HealthCareProviderEntity> getProviderById(Long healthCareProviderId) {
		return healthCareProviderRepository.findById(healthCareProviderId);
	}

	@Override
	public String deleteProviderById(Long healthCareProviderId) {
		healthCareProviderRepository.deleteById(healthCareProviderId);
		return healthCareProviderId+" Provider Deleted";
		
	}
	

}
