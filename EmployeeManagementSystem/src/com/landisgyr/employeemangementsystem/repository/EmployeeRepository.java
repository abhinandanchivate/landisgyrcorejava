package com.landisgyr.employeemangementsystem.repository;

import java.util.List;

import com.landisgyr.employeemangementsystem.dto.Employee;
import com.landisgyr.employeemangementsystem.exception.InvalidIdException;

public interface EmployeeRepository {
	
	public String addEmployee(Employee employee) throws InvalidIdException;
	public Employee[] getEmployees() ;
	public Object[] getEmployees2() ;
	public List<Employee> getEmployees3() ;
	public Employee getEmployeeById(String empId) ;
	public String deleteEmployeeById(String empId);
	public Employee updateEmployee(String empId, Employee employee);
	
	public String deleteAllEmployees() ;

}
