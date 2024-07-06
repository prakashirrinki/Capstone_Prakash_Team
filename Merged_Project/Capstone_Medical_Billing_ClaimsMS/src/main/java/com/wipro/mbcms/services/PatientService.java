package com.wipro.mbcms.services;

import java.util.List;

import java.util.Optional;

import com.wipro.mbcms.entities.PatientEntity;

public interface PatientService {

	PatientEntity registerPatient(PatientEntity patient);
    PatientEntity updatePatient(PatientEntity patient);
    Optional<PatientEntity> getPatientById(Long id);
    PatientEntity getPatientByMobileNumber(String mobileNumber);
    List<PatientEntity> getAllPatients();
}
