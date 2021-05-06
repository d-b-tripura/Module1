package com.capg.emsapp.customDB;
// Dummy Database for employee

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.capg.emsapp.beans.Employee;

public class EmployeeDB {

	public static List<Employee> empList = new ArrayList<Employee>();
	
	static
	{
		Employee e1 = new Employee("mike",101,2000,"ICICI-Bank", "clerk");
		Employee e2 = new Employee("suresh",102,50000,"ICICI-Bank", "manager");
		Employee e3 = new Employee("Ramesh",102,30000,"HDFC-Bank", "programmer");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
	
	}
	
	public static boolean addEmployee(Employee e)
	{
	   return empList.add(e);	
	}
	
}