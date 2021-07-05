package com.landisgyr.employeemangementsystem.service;

import com.landisgyr.employeemangementsystem.dto.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public Employee[] getEmployees() ;
	public Employee getEmployeeById(String empId) ;
	public String deleteEmployeeById(String empId);
	public Employee updateEmployee(String empId, Employee employee);
	
	public String deleteAllEmployees() ;
}
