package com.fdmgroup.global.pojos;

public class AcademyManager {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private UserType userType;
	private OfficeLocation officeLocation;
	private boolean manager;
	
	public AcademyManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AcademyManager(int userId, String firstName, String lastName, String email, String username, String password,
			UserType userType, OfficeLocation officeLocation, boolean manager) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.officeLocation = officeLocation;
		this.manager = manager;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public OfficeLocation getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(OfficeLocation officeLocation) {
		this.officeLocation = officeLocation;
	}

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}
	
	
}
