package com.wipro.mbcms.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class AdministratorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long adminId;
	private String adminUserName;
	private String adminPassword;

	public AdministratorEntity(Long adminId, String username, String password) {
		super();
		this.adminId = adminId;
		this.adminUserName = username;
		this.adminPassword = password;
	}

	public AdministratorEntity() {
		super();
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String userName) {
		this.adminUserName = userName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String password) {
		this.adminPassword = password;
	}

	@Override
	public String toString() {
		return "AdministratorEntity [adminId=" + adminId + ", adminUserName=" + adminUserName + ", AdminPassword=" + adminPassword + "]";
	}

}
