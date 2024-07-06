package com.wipro.mbcms.services;

import java.util.List;




import com.wipro.mbcms.dtos.AdministratorDTO;
import com.wipro.mbcms.entities.AdministratorEntity;
import com.wipro.mbcms.entities.ClaimEntity;
import com.wipro.mbcms.entities.PatientEntity;
import com.wipro.mbcms.entities.UserEntity;

public interface AdministratorService {
	
	AdministratorEntity addAdministratorEntity(AdministratorDTO administratorDTO);
	
	List<UserEntity> getAllUsers();

    List<ClaimEntity> getAllClaims();

    List<PatientEntity> getAllPayments();
}
