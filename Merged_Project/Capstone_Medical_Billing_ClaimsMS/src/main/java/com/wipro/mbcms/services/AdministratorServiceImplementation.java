package com.wipro.mbcms.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.AdministratorDTO;
import com.wipro.mbcms.entities.AdministratorEntity;
import com.wipro.mbcms.entities.ClaimEntity;
import com.wipro.mbcms.entities.PatientEntity;
import com.wipro.mbcms.entities.UserEntity;
import com.wipro.mbcms.repositories.AdministratorRepository;
import com.wipro.mbcms.repositories.ClaimRepository;
import com.wipro.mbcms.repositories.HealthCareProviderRepository;
import com.wipro.mbcms.repositories.InsuranceCompanyRepository;
import com.wipro.mbcms.repositories.PatientRepository;
import com.wipro.mbcms.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class AdministratorServiceImplementation implements AdministratorService{

	@Autowired
	AdministratorEntity administratorEntity;
	
	@Autowired
	AdministratorRepository administratorRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ClaimRepository claimRepository;
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	HealthCareProviderRepository healthCareProviderRepository;
	
	@Autowired
	InsuranceCompanyRepository insuranceCompanyRepository;
	
	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public List<ClaimEntity> getAllClaims() {
		return claimRepository.findAll();
	}

	@Override
	public List<PatientEntity> getAllPayments() {
		return patientRepository.findAll();
	}

	@Override
	public AdministratorEntity addAdministratorEntity(AdministratorDTO administratorDTO) {
		
		administratorEntity.setAdminUserName(administratorDTO.getUsername());
		administratorEntity.setAdminPassword(administratorDTO.getPassword());
		
		return administratorRepository.save(administratorEntity);
	}
	
	

	

	

}
