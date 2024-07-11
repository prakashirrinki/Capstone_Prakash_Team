package com.wipro.mbcms.services;

import java.util.List;

import com.wipro.mbcms.dtos.AdministratorDTO;
import com.wipro.mbcms.entities.AdministratorEntity;


public interface AdministratorService {
	
public AdministratorEntity addAdmin(AdministratorDTO administratorDTO);
	
	public AdministratorEntity updateAdmin(AdministratorDTO administratorDTO);
	
	public List<AdministratorEntity> getAll();


}
