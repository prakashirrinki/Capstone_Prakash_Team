package com.wipro.mbcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.wipro.mbcms.entities.HealthCareProviderEntity;
import com.wipro.mbcms.entities.PatientEntity;

@Repository
public interface HealthCareProviderRepository extends JpaRepository<HealthCareProviderEntity, Long>{
	
	public PatientEntity findByHealthCareProviderName(String name);

}
