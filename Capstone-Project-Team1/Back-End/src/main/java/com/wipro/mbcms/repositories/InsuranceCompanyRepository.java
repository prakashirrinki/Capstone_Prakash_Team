package com.wipro.mbcms.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mbcms.entities.InsuranceCompanyEntity;

@Repository
public interface InsuranceCompanyRepository extends JpaRepository<InsuranceCompanyEntity, Long>{
	
	Optional<InsuranceCompanyEntity> findByCompanyName(String companyName);


}
