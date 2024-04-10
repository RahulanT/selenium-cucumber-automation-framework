package com.fdmgroup.global.pojos;

public class UserType {
	private int userTypeId;
	private String name;
	
	public UserType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public UserType(int userTypeId, String name) {
		super();
		userTypeId = userTypeId;
		this.name = name;
	}
	



	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		userTypeId = userTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
