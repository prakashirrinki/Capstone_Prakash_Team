package com.wipro.mbcms.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mbcms.entities.HealthCareProviderEntity;

@Repository
public interface HealthCareProviderRepository extends JpaRepository<HealthCareProviderEntity, Long>{
	
	Optional<HealthCareProviderEntity> findByProviderName(String providerName);

}
