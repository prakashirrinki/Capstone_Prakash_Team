package com.wipro.mbcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mbcms.dtos.HealthCareProviderDTO;
import com.wipro.mbcms.dtos.PatientDTO;

@Repository
public interface HealthCareProviderRepository extends JpaRepository<HealthCareProviderDTO, Long>{
	
	public PatientDTO findByHealthCareProviderName(String name);

}
