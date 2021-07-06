package com.landisgyr.employeemangementsystem;

import com.landisgyr.employeemangementsystem.dto.Employee;
import com.landisgyr.employeemangementsystem.service.EmployeeService;
import com.landisgyr.employeemangementsystem.service.EmployeeServiceImpl;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		
		Employee employee = new Employee("ab001", "abhi", "chivate", 100.0f);
		Employee employee2 = new Employee("ab001", "abhi", "chivate", 100.0f);
		Employee employee3 = new Employee("ab001", "abhi", "chivate", 100.0f);
		

	}

}
