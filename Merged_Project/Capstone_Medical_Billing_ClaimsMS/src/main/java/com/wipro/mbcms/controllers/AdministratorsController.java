package com.wipro.mbcms.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mbcms.dtos.AdministratorDTO;
import com.wipro.mbcms.entities.AdministratorEntity;
import com.wipro.mbcms.entities.ClaimEntity;
import com.wipro.mbcms.entities.PatientEntity;
import com.wipro.mbcms.entities.UserEntity;
import com.wipro.mbcms.services.AdministratorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/administrator")
public class AdministratorsController {

	@Autowired
	private AdministratorService administratorService;

	public AdministratorsController(AdministratorService administratorService) {
		super();
		this.administratorService = administratorService;
	}

	@GetMapping("/users/getAllUsers")
	public List<UserEntity> getAllUsers() {
		return administratorService.getAllUsers();
	}

	@GetMapping("/claims/getAllClaims")
	public List<ClaimEntity> getAllClaims() {
		return administratorService.getAllClaims();
	}

	@GetMapping("/payments/getAllPayments")
	public List<PatientEntity> getAllPayments() {
		return administratorService.getAllPayments();
	}
	
	@PostMapping("/admin/addadmin")
	public AdministratorEntity addAdministratorentity(@RequestBody AdministratorDTO administrator) {
		
		return administratorService.addAdministratorEntity(administrator);
	}
	

}
