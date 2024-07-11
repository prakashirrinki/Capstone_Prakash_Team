package com.wipro.mbcms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdministratorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long administratorId;
	private String adminName;
	private String administratorPassword;
	private final String role = "ADMIN";
	
	
	  public AdministratorEntity(long administratorId, String adminName, String
	  administratorPassword) { super(); this.administratorId = administratorId;
	  this.adminName = adminName; this.administratorPassword =
	  administratorPassword; } public AdministratorEntity() { super(); }	
	  
	  public long getAdministratorId() { return administratorId; } public void
	  setAdministratorId(long administratorId) { this.administratorId =
	  administratorId; } public String getAdminName() { return adminName; } public
	  void setAdminName(String adminName) { this.adminName = adminName; } public
	  String getAdministratorPassword() { return administratorPassword; } public
	  void setAdministratorPassword(String administratorPassword) {
	  this.administratorPassword = administratorPassword; } public String getRole()
	  { return role; }
	  
	  @Override public String toString() { return
	  "AdministratorEntity [administratorId=" + administratorId + ", adminName=" +
	  adminName + ", administratorPassword=" + administratorPassword + ", role=" +
	  role + "]"; }
	 

}
