package com.example.Tekbay.Common;

public class JlvmDto {
	
	private String emp_name;
	private String designation;
	private String location;
    private String address;
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public JlvmDto(String emp_name, String designation, String location, String address) {
		super();
		this.emp_name = emp_name;
		this.designation = designation;
		this.location = location;
		this.address = address;
	}
    
    
}
