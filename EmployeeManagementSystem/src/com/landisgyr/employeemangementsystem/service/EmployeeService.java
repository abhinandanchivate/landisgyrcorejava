package com.landisgyr.employeemangementsystem.service;

import java.util.List;

import com.landisgyr.employeemangementsystem.dto.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public Employee[] getEmployees() ;
	public Object[] getEmployees2() ;
	public List<Employee> getEmployees3() ;
	public Employee getEmployeeById(String empId) ;
	public String deleteEmployeeById(String empId);
	public Employee updateEmployee(String empId, Employee employee);
	
	public String deleteAllEmployees() ;
}
