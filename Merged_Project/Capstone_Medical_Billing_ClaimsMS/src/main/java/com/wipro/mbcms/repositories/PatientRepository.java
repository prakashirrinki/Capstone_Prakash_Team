package com.wipro.mbcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.wipro.mbcms.entities.PatientEntity;
import java.util.List;


public interface PatientRepository extends JpaRepository<PatientEntity, Long>{
	
	public List<PatientEntity> findByPatientId(Long patientId);

}
