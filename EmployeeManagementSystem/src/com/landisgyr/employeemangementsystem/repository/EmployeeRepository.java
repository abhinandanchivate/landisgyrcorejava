package com.landisgyr.employeemangementsystem.repository;

import com.landisgyr.employeemangementsystem.dto.Employee;

public interface EmployeeRepository {
	
	public String addEmployee(Employee employee);
	public Employee[] getEmployees() ;
	public Employee getEmployeeById(String empId) ;
	public String deleteEmployeeById(String empId);
	public Employee updateEmployee(String empId, Employee employee);
	
	public String deleteAllEmployees() ;

}
