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

import com.wipro.mbcms.dtos.InsurancePlansDTO;
import com.wipro.mbcms.entities.InsurancePlansEntity;
import com.wipro.mbcms.services.InsurancePlanService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/plans")
public class InsurancePlanController {
	@Autowired
	InsurancePlanService insurancePlanService;

	@PostMapping("/add")
	public InsurancePlansEntity addNewPlan(@RequestBody InsurancePlansDTO insurancePlansDTO) {
		return insurancePlanService.addInsurancePlan(insurancePlansDTO);
	}

	@PutMapping("/update")
	public InsurancePlansEntity updateInsurancePlans(@RequestBody InsurancePlansDTO insurancePlansDTO) {
		return insurancePlanService.updateInsurancePlans(insurancePlansDTO);
	}

	@DeleteMapping("/delete/{planId}")
	public void deletePlans(@PathVariable Long insurancePlanId) {
		insurancePlanService.deleteInsurancePlan(insurancePlanId);
	}

	@GetMapping("/getAllPlans")
	public List<InsurancePlansEntity> getAllPlans() {
		return insurancePlanService.getAllPlans();
	}

}
