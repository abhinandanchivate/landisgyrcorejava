package com.landisgyr.employeemangementsystem.repository;

import java.util.ArrayList;
import java.util.List;

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
		
		return "not found";
		
	}
	
	// update 
	
	public Employee updateEmployee(String empId, Employee employee) {
		return null;  // update employee code assignment
	}
	
	public String deleteAllEmployees() {
		return null; // should delete all empls assignment
	}

	@Override
	public Object[] getEmployees2() {
		// TODO Auto-generated method stub
		return employees.toArray();
		
	}

	@Override
	public List<Employee> getEmployees3() {
		// TODO Auto-generated method stub
		return employees;
	}
}
