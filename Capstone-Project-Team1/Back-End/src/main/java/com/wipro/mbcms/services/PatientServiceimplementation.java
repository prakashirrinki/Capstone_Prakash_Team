package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.PatientDTO;
import com.wipro.mbcms.entities.PatientEntity;
import com.wipro.mbcms.repositories.PatientRepository;

@Service
public class PatientServiceimplementation implements PatientService{

	@Autowired
	PatientRepository patientRepository;
	
	
	@Override
	public List<PatientEntity> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public PatientEntity addPatients(PatientDTO patientDTO) {
		PatientEntity patientEntity=new PatientEntity();
		patientEntity.setPatientName(patientDTO.getPatientName());
		patientEntity.setPatientEmail(patientDTO.getPatientEmail());
		patientEntity.setPatientPassword(patientDTO.getPatientPassword());
		patientEntity.setPatientGender(patientDTO.getPatientGender());
		patientEntity.setPatientDateOfBirth(patientDTO.getPatientDateOfBirth());
		patientEntity.setPatientMobileNumber(patientDTO.getPatientMobileNumber());
		patientEntity.setPatientAddress(patientDTO.getPatientAddress());
		patientEntity.setPatientSymptoms(patientDTO.getPatientSymptoms());
		patientEntity.setPatientTreatment(patientDTO.getPatientTreatment());
		
		return patientRepository.save(patientEntity);
	}

	@Override
	public PatientEntity updatePatients(PatientDTO patientDTO) {
		PatientEntity patientEntity=new PatientEntity();
		patientEntity.setPatientId(patientDTO.getPatientId());
		patientEntity.setPatientName(patientDTO.getPatientName());
		patientEntity.setPatientEmail(patientDTO.getPatientEmail());
		patientEntity.setPatientPassword(patientDTO.getPatientPassword());
		patientEntity.setPatientGender(patientDTO.getPatientGender());
		patientEntity.setPatientDateOfBirth(patientDTO.getPatientDateOfBirth());
		patientEntity.setPatientMobileNumber(patientDTO.getPatientMobileNumber());
		patientEntity.setPatientAddress(patientDTO.getPatientAddress());
		patientEntity.setPatientSymptoms(patientDTO.getPatientSymptoms());
		patientEntity.setPatientTreatment(patientDTO.getPatientTreatment());
		
		return patientRepository.save(patientEntity);
	}

	@Override
	public Optional<PatientEntity> getPatientByName(String patientName) {
		return patientRepository.findByPatientName(patientName);
	}

	@Override
	public String deletPatients(long patientId) {
		patientRepository.deleteById(patientId);
		return patientId+"Patient Deleted";
	}

}
