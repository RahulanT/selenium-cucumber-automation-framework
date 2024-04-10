package com.fdmgroup.global.pojos;
import java.util.Date;

public class Trainee {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private UserType userType;
	private OfficeLocation officeLocation;
	private Cohort cohort;
	private Status status;
	private Date startDate;
	private boolean probationStatus;
	private boolean exMilitary;
	private Date signOffDate;
	
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Trainee(int userId, String firstName, String lastName, String email, String username, String password,
//			UserType userType, OfficeLocation officeLocation, Cohort cohort, Status status, String startDate,
//			boolean probationStatus, boolean exMilitary, String signOffDate) {
//		super();
//		this.userId = userId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.username = username;
//		this.password = password;
//		this.userType = userType;
//		this.officeLocation = officeLocation;
//		this.cohort = cohort;
//		this.status = status;
//		this.startDate = startDate;
//		this.probationStatus = probationStatus;
//		this.exMilitary = exMilitary;
//		this.signOffDate = signOffDate;
//	}
	
	public Trainee(int userId, String firstName, String lastName, String email, String username, String password,
			UserType userType, OfficeLocation officeLocation, Cohort cohort, Status status, Date startDate,
			boolean probationStatus, boolean exMilitary, Date signOffDate) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.officeLocation = officeLocation;
		this.cohort = cohort;
		this.status = status;
		this.startDate = startDate;
		this.probationStatus = probationStatus;
		this.exMilitary = exMilitary;
		this.signOffDate = signOffDate;
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

//	public UserType getuserType() {
//		return userType;
//	}
//
//	public void setuserType(UserType userType) {
//		this.userType = userType;
//	}

	public OfficeLocation getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(OfficeLocation officeLocation) {
		this.officeLocation = officeLocation;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

//	public String getStartDate() {
//		return startDate;
//	}
//
//	public void setStartDate(String startDate) {
//		this.startDate = startDate;
//	}

	public boolean isProbationStatus() {
		return probationStatus;
	}

	public void setProbationStatus(boolean probationStatus) {
		this.probationStatus = probationStatus;
	}

	public boolean isExMilitary() {
		return exMilitary;
	}

	public void setExMilitary(boolean exMilitary) {
		this.exMilitary = exMilitary;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getSignOffDate() {
		return signOffDate;
	}

	public void setSignOffDate(Date signOffDate) {
		this.signOffDate = signOffDate;
	}

//	public String getSignOffDate() {
//		return signOffDate;
//	}
//
//	public void setSignOffDate(String signOffDate) {
//		this.signOffDate = signOffDate;
//	}
	
	
	
	


	
	
}
