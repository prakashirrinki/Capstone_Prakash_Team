package com.wipro.mbcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mbcms.entities.InsuranceClaimsEntity;

@Repository
public interface InsuranceClaimsRepository extends JpaRepository<InsuranceClaimsEntity, Long>{
	
	

}
