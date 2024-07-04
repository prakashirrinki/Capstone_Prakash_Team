package com.wipro.mbcms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdministratorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long adminId;
	private String username;
	private String password;

	public AdministratorEntity(Long adminId, String username, String password) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdministratorEntity [adminId=" + adminId + ", username=" + username + ", password=" + password + "]";
	}

}
