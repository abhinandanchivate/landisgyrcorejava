package com.landisgyr.employeemangementsystem.repository;

import java.util.List;

import com.landisgyr.employeemangementsystem.dto.Employee;

public interface EmployeeRepository {
	
	public String addEmployee(Employee employee);
	public Employee[] getEmployees() ;
	public Object[] getEmployees2() ;
	public List<Employee> getEmployees3() ;
	public Employee getEmployeeById(String empId) ;
	public String deleteEmployeeById(String empId);
	public Employee updateEmployee(String empId, Employee employee);
	
	public String deleteAllEmployees() ;

}
