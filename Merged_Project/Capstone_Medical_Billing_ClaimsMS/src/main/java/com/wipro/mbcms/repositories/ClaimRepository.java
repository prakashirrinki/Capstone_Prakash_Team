package com.wipro.mbcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.wipro.mbcms.entities.ClaimEntity;
import java.util.List;


public interface ClaimRepository extends JpaRepository<ClaimEntity, Long>{
	
	public List<ClaimEntity> findByPatientId(Long patientId);

}
