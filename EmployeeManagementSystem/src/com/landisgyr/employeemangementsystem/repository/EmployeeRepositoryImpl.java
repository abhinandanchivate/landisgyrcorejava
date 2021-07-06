package com.landisgyr.employeemangementsystem.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.landisgyr.employeemangementsystem.dto.Employee;
import com.landisgyr.employeemangementsystem.utils.IdComparator;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	TreeSet<Employee> employees = new TreeSet<>(new IdComparator());
	
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
		
		if(employees.remove(this.getEmployeeById(empId))) {
			return "success";
		}
		else {
		return "not found";
		}
		
	}
	
	// update 
	
	public Employee updateEmployee(String empId, Employee employee) {
		return null;  // update employee code assignment
	}
	
	public String deleteAllEmployees() {
		if(employees.size()>=1) {
			employees.clear();
			return "success";
		}
		else
		return "empty"; // should delete all empls assignment
	}

	@Override
	public Object[] getEmployees2() {
		// TODO Auto-generated method stub
		return employees.toArray();
		
	}

	@Override
	public List<Employee> getEmployees3() {
		// TODO Auto-generated method stub
		return new ArrayList<>(employees);
	}
}
