package com.wipro.mbcms.dtos;

public class AdministratorDTO {

	private long adminId;
	private String username;
	private String password;

	public AdministratorDTO(long adminId, String username, String password) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
	}

	public AdministratorDTO() {
		super();
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
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
		return "AdministratorDTO [adminId=" + adminId + ", username=" + username + ", password=" + password + "]";
	}

}
