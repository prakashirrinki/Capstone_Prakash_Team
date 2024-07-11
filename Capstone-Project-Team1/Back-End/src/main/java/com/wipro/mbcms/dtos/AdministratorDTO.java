package com.wipro.mbcms.dtos;

public class AdministratorDTO {

	private long administratorId;
	private String adminName;
	private String administratorPassword;
	private final String role = "ADMIN";

	public AdministratorDTO() {
		super();
	}

	public AdministratorDTO(long administratorId, String adminName, String administratorPassword) {
		super();
		this.administratorId = administratorId;
		this.adminName = adminName;
		this.administratorPassword = administratorPassword;
	}

	public long getAdministratorId() {
		return administratorId;
	}

	public void setAdministratorId(long administratorId) {
		this.administratorId = administratorId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdministratorPassword() {
		return administratorPassword;
	}

	public void setAdministratorPassword(String administratorPassword) {
		this.administratorPassword = administratorPassword;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "AdministratorDTO [administratorId=" + administratorId + ", adminName=" + adminName
				+ ", administratorPassword=" + administratorPassword + ", role=" + role + "]";
	}
	
	

}
