package com.wipro.mbcms.dtos;

import java.util.List;

public class InsuranceCompanyDTO {

	private Long id;
	private String name;

	private List<InsurencePlanDTO> plans;

	public InsuranceCompanyDTO(Long id, String name, List<InsurencePlanDTO> plans) {
		super();
		this.id = id;
		this.name = name;
		this.plans = plans;
	}

	public InsuranceCompanyDTO() {
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

	public List<InsurencePlanDTO> getPlans() {
		return plans;
	}

	public void setPlans(List<InsurencePlanDTO> plans) {
		this.plans = plans;
	}

	@Override
	public String toString() {
		return "InsurenceCompanyDTO [id=" + id + ", name=" + name + ", plans=" + plans + "]";
	}

}
