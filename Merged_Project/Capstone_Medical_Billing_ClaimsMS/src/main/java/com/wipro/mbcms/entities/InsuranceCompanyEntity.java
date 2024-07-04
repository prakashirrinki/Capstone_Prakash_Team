package com.wipro.mbcms.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InsuranceCompanyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private List<InsurancePlanEntity> plans;
	public InsuranceCompanyEntity(Long id, String name, List<InsurancePlanEntity> plans) {
		super();
		this.id = id;
		this.name = name;
		this.plans = plans;
	}
	public InsuranceCompanyEntity() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<InsurancePlanEntity> getPlans() {
		return plans;
	}
	public void setPlans(List<InsurancePlanEntity> plans) {
		this.plans = plans;
	}
	@Override
	public String toString() {
		return "InsuranceCompanyEntity [id=" + id + ", name=" + name + ", plans=" + plans + "]";
	}
	
	

}
