package com.wipro.mbcms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.mbcms.entities.PatientEntity;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class PatientServiceImplementation implements PatientService{

	@Override
	public PatientEntity registerPatient(PatientEntity patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientEntity updatePatient(PatientEntity patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PatientEntity> getPatientById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public PatientEntity getPatientByMobileNumber(String mobileNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PatientEntity> getAllPatients() {
		// TODO Auto-generated method stub
		return null;
	}

}
