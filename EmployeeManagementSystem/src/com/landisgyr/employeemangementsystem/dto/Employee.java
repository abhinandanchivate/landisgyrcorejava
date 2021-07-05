package com.landisgyr.employeemangementsystem.dto;

import lombok.Data;

@Data
public class Employee extends Person {
// all fields should be private except constants.
	private String empId;
	
	protected float empSalary;
	private String permanantAddress;
	private String currentAddress;
	private String contactNumber;
	private String location;
	// parameterized constructor.// can we provide the values
	public Employee(String empId, String empFirstName, String empLastName, float empSalary, String permanantAddress,
			String contactNumber) {
		this(empId, empFirstName, empLastName, empSalary);
		this.permanantAddress = permanantAddress;
		this.contactNumber = contactNumber;
	}
	public Employee() {
		super("","");
		// TODO Auto-generated constructor stub
		System.out.println("hello from Employee");
	}
	public Employee(String empId, String empFirstName, String empLastName, float empSalary, String permanantAddress,
			String currentAddress, String contactNumber, String location) {
//		super();
	this(empId, empFirstName, empLastName, empSalary);
		this.permanantAddress = permanantAddress;
		this.currentAddress = currentAddress;
		this.contactNumber = contactNumber;
		this.location = location;
	}
	public Employee(String empId, String empFirstName, String empLastName, float empSalary) {
		super(empFirstName,empLastName);
		this.empId = empId;
		//super.setEmpFirstName(empFirstName);
		//super.setEmpLastName(empLastName);
		this.empSalary = empSalary;
	}

	public float calculateSalary() {
		return this.empSalary + 200;
	}
	
	@Override
		public String getDetails() {
			// TODO Auto-generated method stub
			return "details";
		}

	
}
