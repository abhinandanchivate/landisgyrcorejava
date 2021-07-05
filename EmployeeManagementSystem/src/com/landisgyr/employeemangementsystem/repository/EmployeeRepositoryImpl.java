package com.landisgyr.employeemangementsystem.repository;

import java.util.ArrayList;


import com.landisgyr.employeemangementsystem.dto.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	ArrayList<Employee> employees = new ArrayList<>();
	
	public String addEmployee(Employee employee) {
	
		employees.add(employee);
		return "success";
		
	}
	
	public Employee[] getEmployees() {
		Employee[] employees2 = new Employee[employees.size()];
		return employees.toArray(employees2);
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
