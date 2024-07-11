package com.wipro.mbcms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mbcms.dtos.PatientDTO;
import com.wipro.mbcms.entities.PatientEntity;
import com.wipro.mbcms.services.PatientService;

/*
 * Author Name = Firoze Baba Mohammad
 * 
 * Module : Patient
 * 
 * Description : It is used to view the insurance plans and claims the plans
 * 
 * */
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/patient")
public class PatientController {
	@Autowired
	PatientService patientService;
	
	@GetMapping("/getAllPatients")
	public List<PatientEntity> getAllPatients() {
		return patientService.getAllPatients();
	}

	@PostMapping("/add")
	public PatientEntity addPatients(@RequestBody PatientDTO patientDTO) {
		PatientEntity patient = patientService.addPatients(patientDTO);
		return patient;
	}

	@PutMapping("/update")
	public PatientEntity updatePatient(@RequestBody PatientDTO patientDTO) {
		return patientService.updatePatients(patientDTO);
	}
	
	@DeleteMapping("/delete/{patientId}")
	public String deletePatients(@PathVariable int patientId) {
		patientService.deletPatients(patientId);
		return "Successfully Deleted patient with id: " + patientId;
	}
	
}
