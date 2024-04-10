package com.fdmgroup.global.pojos;

public class Cohort {
	private int cohortId;
	Stream stream;
	private String code;
	
	public Cohort() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cohort(int cohortId, Stream stream, String code) {
		super();
		this.cohortId = cohortId;
		this.stream = stream;
		this.code = code;
	}

	public int getCohortId() {
		return cohortId;
	}

	public void setCohortId(int cohortId) {
		this.cohortId = cohortId;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
