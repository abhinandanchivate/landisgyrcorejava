package com.landisgyr.employeemangementsystem.service;

import com.landisgyr.employeemangementsystem.dto.Employee;
import com.landisgyr.employeemangementsystem.repository.EmployeeRepository;

public class EmployeeService {

	EmployeeRepository employeeRepository  = new EmployeeRepository();
	// have we created repo object.
	public String addEmployee(Employee employee) {
		// background verification
		// criminal cross check 
		// address verification
		
		return employeeRepository.addEmployee(employee);
	}
	
	public Employee[] getEmployees() {
		return employeeRepository.getEmployees();
	}
	
	public Employee getEmployeeById(String empId) {
		return employeeRepository.getEmployeeById(empId);
	}
}
