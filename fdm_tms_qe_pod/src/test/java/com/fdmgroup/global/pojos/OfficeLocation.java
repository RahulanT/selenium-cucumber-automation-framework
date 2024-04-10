package com.fdmgroup.global.pojos;

public class OfficeLocation {
	private int id;
	private String city;
	private String country;
	private String stateOrProvince;
	
	public OfficeLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public OfficeLocation(int id, String city, String country, String stateOrProvince) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
		this.stateOrProvince = stateOrProvince;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStateOrProvince() {
		return stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}
	
	
}
