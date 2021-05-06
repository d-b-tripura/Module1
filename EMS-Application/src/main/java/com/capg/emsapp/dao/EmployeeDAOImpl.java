package com.capg.emsapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.capg.emsapp.beans.Employee;
import com.capg.emsapp.customDB.EmployeeDB;
/*
 * DAO :- Data Access Object
 * Includes all business logic related to database 
 * 
 * */

public class EmployeeDAOImpl implements IEmployeeDAO {

	List<Employee> empList = EmployeeDB.empList; // code will be replaced with database connection code
	
	
	public boolean insertEmployee(Employee e) {
		
		// replace code with insert query
		boolean isEmpInserted = EmployeeDB.addEmployee(e);
		
		// update database
		empList = EmployeeDB.empList;
		
		return isEmpInserted;
	}

	public List<Employee> getAllEmployees() {
		
		return empList;  // select * from Employee
	}

	public List<Employee> getAllEmployeesBySalary(int range1,int range2) {
		
		List<Employee> tempList = new ArrayList<Employee>();
		tempList.clear();	
		
		for (Employee employee : empList) {
			
			if(employee.getSalary()>=range1 && employee.getSalary() <= range2)
			{
				tempList.add(employee);
			}
			
		}
		
		return tempList;
	}

	public Employee getEmployeeById(int id) {
		
		
		for (Employee employee : empList) {
			if(employee.getId() == id)
			{
				return employee;
			}
		}
		return null;
	}
	public Employee findInsuranceScheme(Employee e) {
		if((e.getDesignation().equals("system_associate")) && (e.getSalary() > 5000 && e.getSalary() < 20000)) {
			e.setInsuranceScheme("Scheme_C");
		} else if((e.getDesignation().equals("programmer")) && (e.getSalary() < 40000 && e.getSalary() >= 20000)) {
			e.setInsuranceScheme("Scheme_B");
		} else if((e.getDesignation().equals("manager")) && (e.getSalary() >= 40000)) {
			e.setInsuranceScheme("Scheme_A");
		} else {
			e.setInsuranceScheme("No_Scheme");
		}
		return e;
	}

}