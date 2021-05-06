package com.capg.emsapp.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.emsapp.beans.Employee;
import com.capg.emsapp.service.EmployeeServiceImpl;
import com.capg.emsapp.service.IEmployeeService;

public class MainUIClass {
	Scanner sc;
	IEmployeeService empService;
	
	public MainUIClass() {
		empService = new EmployeeServiceImpl();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		MainUIClass obj = new MainUIClass();
		Scanner sc = new Scanner(System.in);

		// menu based program 
		obj.displayAllEmployee();
		obj.insertEmployeeInforamtion();
		obj.displayAllEmployee();
		/*int id1 = sc.nextInt();
		obj.displayById(id1);
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		obj.displayBySalary(r1, r2);
		*/
		obj.get_InsuranceScheme();
		
		
	}
	
	public void insertEmployeeInforamtion()
	{
		System.out.println(" \n Enter Employee Informations \n");
		System.out.println(" Enter Employee Name ");
		String empName = sc.nextLine();
		
		System.out.println(" Enter Employee Id ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Employee Salary ");
		int salary = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Project  Name ");
		String projectName = sc.nextLine();
		
		System.out.println(" Enter Designation  Name clerk/system_associate/programmer/manager");
		String designation = sc.next();
		
		Employee e = new Employee(empName, id, salary, projectName, designation);
		
		try
		{
			boolean isInserted = empService.insertEmployee(e);
			
			// -----
		}
		catch(Exception excep)
		{
			
			System.out.println(" Contact HR "+excep);
		}
		
		
	}
	
	public void displayAllEmployee()
	{
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = empService.getAllEmployees();
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
	
	public void displayById(int id1)
	{
		System.out.println("\n=========== Employees Information ===========\n");
		Employee e = empService.getEmployeeById(id1);
		displayEmployee(e);
	}	

	public void displayBySalary(int r1, int r2)
	{
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = empService.getAllEmployeesBySalary(r1, r2);
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
	
	public void get_InsuranceScheme() {
		List<Employee> empList = empService.getAllEmployees();
		for(Employee e : empList) {
			Employee emp = empService.findInsuranceScheme(e);
			displayEmployeeInsurance(e);
		}
	}

	public void displayEmployee(Employee e)
	{
		System.out.println(" Name "+e.getEmpName());
		System.out.println(" ID "+e.getId());
		System.out.println(" Salary "+e.getSalary());
		System.out.println("\n---------------------------------------------\n");
		
		
	}
	
	public void displayEmployeeInsurance(Employee e)
	{
		System.out.println(" Name "+e.getEmpName());
		System.out.println(" ID "+e.getId());
		System.out.println(" Salary "+e.getSalary());
		System.out.println(" Salary "+e.getInsuranceScheme());
		System.out.println("\n---------------------------------------------\n");
		
		
	}

}