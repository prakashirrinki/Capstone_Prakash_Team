package com.wipro.mbcms.services;

import java.util.List;

import com.wipro.mbcms.entities.AdministratorEntity;

public interface AdministratorService {
	
	public AdministratorEntity registerAdmin(AdministratorEntity admin);
	public AdministratorEntity getAdminById(Long id);
	public AdministratorEntity getAdminByUsername(String username);
	public List<AdministratorEntity> getAllAdmins();
}
