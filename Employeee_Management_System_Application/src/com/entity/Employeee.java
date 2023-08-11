package com.entity;

public class Employeee {
	
	private int EmployeeeId;
	private String EmployeeeName;
	private String EmployeeePhone;
	private String EmployeeeCity;


	public Employeee(int EmployeeeId, String EmployeeeName, String EmployeeePhone, String EmployeeeCity) {
		super();
		this.EmployeeeId = EmployeeeId;
		this.EmployeeeName = EmployeeeName;
		this.EmployeeePhone = EmployeeePhone;
		this.EmployeeeCity = EmployeeeCity;
	}


//	public Employeee(String EmployeeeName, String EmployeeePhone, String EmployeeeCity) {
//		super();
//		thisEmployeeeName = EmployeeeName;
//		this.EmployeeePhone = EmployeeePhone;
//		this.EmployeeeCity =EmployeeeCity;
//	}


	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEmployeeeId() {
		return EmployeeeId;
	}


	public void setEmployeeeId(int EmployeeeId) {
		this.EmployeeeId = EmployeeeId;
	}


	public String getEmployeeeName() {
		return EmployeeeName;
	}


	public void setEmployeeeName(String EmployeeeName) {
		this.EmployeeeName = EmployeeeName;
	}


	public String getEmployeeePhone() {
		return EmployeeePhone;
	}


	public void setEmployeeePhone(String EmployeeePhone) {
		this.EmployeeePhone = EmployeeePhone;
	}


	public String getEmployeeeCity() {
		return EmployeeeCity;
	}


	public void setEmployeeeCity(String EmployeeeCity) {
		this.EmployeeeCity = EmployeeeCity;
	}


	@Override
	public String toString() {
		return "Employeee [EmployeeeId=" + EmployeeeId + ", EmployeeeName=" + EmployeeeName + ", EmployeeePhone=" + EmployeeePhone
				+ ", EmployeeeCity=" + EmployeeeCity + "]";
	}



}


