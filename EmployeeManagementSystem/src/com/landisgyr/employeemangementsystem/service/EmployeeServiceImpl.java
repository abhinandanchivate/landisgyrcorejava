package com.landisgyr.employeemangementsystem.service;

import com.landisgyr.employeemangementsystem.dto.Employee;
import com.landisgyr.employeemangementsystem.repository.EmployeeRepository;
import com.landisgyr.employeemangementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository  = new EmployeeRepositoryImpl();
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

	@Override
	public String deleteEmployeeById(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
}