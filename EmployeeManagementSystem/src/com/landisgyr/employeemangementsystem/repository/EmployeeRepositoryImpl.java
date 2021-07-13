package com.landisgyr.employeemangementsystem.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.landisgyr.employeemangementsystem.dto.Employee;
import com.landisgyr.employeemangementsystem.utils.DBUtils;
import com.landisgyr.employeemangementsystem.utils.IdComparator;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	//TreeSet<Employee> employees = new TreeSet<>(new IdComparator());
	
	public String addEmployee(Employee employee) {
	
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String insertQuery = "insert into employee (empid,empfirstname,emplastname,empsalary) values(?,?,?,?)";
		try {
			connection = DBUtils.getConnection();
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpFirstName());
			preparedStatement.setString(3, employee.getEmpLastName());
			preparedStatement.setFloat(4, employee.getEmpSalary());
			int res = preparedStatement.executeUpdate();
			
			if(res>=1) {
				connection.commit();
				return "success";
			}
			else 
				return "fail";
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
		
			DBUtils.closeConnection(connection);
		}
		
		
		return "success";
		
	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getEmployees2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees3() {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String insertQuery = "select * from employee";
		try {
			connection = DBUtils.getConnection();
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(insertQuery);
			
			ResultSet res = preparedStatement.executeQuery();
			// all records are stored in resultset obejct
			// cursor is available to traverse the result set .
			// initially cursor / traverser will be placed just before the 1st record.
			// when we will call next method for the 1st time then it will start traversing from 1st record.
			
			while(res.next()) {
				
			}
			
		
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
		
			DBUtils.closeConnection(connection);
		}
		

	}

	@Override
	public Employee getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		return null;
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
