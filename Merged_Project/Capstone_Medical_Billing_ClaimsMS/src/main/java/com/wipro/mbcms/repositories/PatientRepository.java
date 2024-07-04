package com.wipro.mbcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.mbcms.dtos.PatientDTO;
import com.wipro.mbcms.entities.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Long>{

}
