package com.landisgyr.employeemangementsystem.repository;

import com.landisgyr.employeemangementsystem.dto.Employee;

public class EmployeeRepository {

	private Employee employees[]= new Employee[10];
	// it will give us 10 ref.
	static int counter = 0;
	//@Purpose : to add the employee into array
	// if the size is full then it should return arrayFull if not it should 
	// add the employee in an array then it should return success
	// if any problem is there then it should return problem
	public String addEmployee(Employee employee) {
		// length of an array 
		// occupancy of an array.
		
		if(counter<10) {
			// we can allow adding the object in an array
			employees[counter] = employee;
			counter++;
			return "success";
		}
		else {
			return "arrayisFull";
		}
		// if not it should return a message array full.
	}
	
	public Employee[] getEmployees() {
		return employees;
	}
	
	public Employee getEmployeeById(String empId) {
		for (Employee employee : employees) {
			
			if(employee!=null && empId.equals(employee.getEmpId())) {
			// 
				return employee;
			}
		}
		return null;
	}
	
	// delete 
	public String deleteEmployeeById(String empId) {
		for (int i = 0; i < employees.length; i++) {
			
			if(empId.equals(employees[i].getEmpId())) {
				
				//Employee employee = employees[i];
				employees[i] = null;
				return "success";//employee.getEmpId();
			}
		}
		return "not found";
		
	}
	
	// update 
	
	public Employee updateEmployee(String empId, Employee employee) {
		return null;  // update employee code assignment
	}
	
	public String deleteAllEmployees() {
		return null; // should delete all empls assignment
	}
}
