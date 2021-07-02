package com.landisgyr.employeemangementsystem.dto;

import lombok.Data;

@Data
public class Employee {
// all fields should be private except constants.
	private String empId;
	private String empFirstName;
	private String empLastName;
	private float empSalary;
	private String permanantAddress;
	private String currentAddress;
	private String contactNumber;
	private String location;
	// parameterized constructor.// can we provide the values
	public Employee(String empId, String empFirstName, String empLastName, float empSalary, String permanantAddress,
			String contactNumber) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.permanantAddress = permanantAddress;
		this.contactNumber = contactNumber;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	
}
