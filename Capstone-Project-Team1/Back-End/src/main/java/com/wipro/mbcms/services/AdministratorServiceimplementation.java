package com.wipro.mbcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mbcms.dtos.AdministratorDTO;
import com.wipro.mbcms.entities.AdministratorEntity;
import com.wipro.mbcms.repositories.AdministratorRepository;

@Service
public class AdministratorServiceimplementation implements AdministratorService{

	@Autowired
	AdministratorRepository administratorRepository;
	
	@Override
	public AdministratorEntity addAdmin(AdministratorDTO administratorDTO) {
		AdministratorEntity administratorEntity=new AdministratorEntity();
		administratorEntity.setAdminName(administratorDTO.getAdminName());
		administratorEntity.setAdministratorPassword((administratorDTO.getAdministratorPassword()));
		
		return administratorRepository.save(administratorEntity);
	}

	@Override
	public AdministratorEntity updateAdmin(AdministratorDTO administratorDTO) {
		AdministratorEntity administratorEntity=new AdministratorEntity();
		administratorEntity.setAdministratorId(administratorDTO.getAdministratorId());
		administratorEntity.setAdminName(administratorDTO.getAdminName());
		administratorEntity.setAdministratorPassword(administratorDTO.getAdministratorPassword());
		
		return administratorRepository.save(administratorEntity);
	}

	@Override
	public List<AdministratorEntity> getAll() {
		return administratorRepository.findAll();
	}

}
