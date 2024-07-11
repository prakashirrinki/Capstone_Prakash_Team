package com.wipro.mbcms.services;

import java.util.List;

import java.util.Optional;

import com.wipro.mbcms.dtos.PatientDTO;
import com.wipro.mbcms.entities.PatientEntity;

public interface PatientService {
	
	public List<PatientEntity> getAllPatients();

	public PatientEntity addPatients(PatientDTO patientDTO);

	public PatientEntity updatePatients(PatientDTO patientDTO);
	
	public Optional<PatientEntity> getPatientByName(String patientName);

	public String deletPatients(long patientId);


}
