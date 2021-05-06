package com.cg.eis.pl;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeException;
import com.cg.eis.service.EmployeeServiceImp;

public class MainUI {
	static Scanner sc = new Scanner(System.in);
	
	static EmployeeServiceImp esi = new EmployeeServiceImp();
	static Employee emp = new  Employee();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainUI obj = new MainUI();
		
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Enter employee"+"\n"+"2. Display employees"+"\n"+"3. Display Insurance Scheme"+"\n"+"4. Remove Employee"+"\n"+"0. Exit");
			int n = Integer.parseInt(sc.nextLine());
			switch(n) {
			case 1: 
				obj.insertEmp();
				break;
			case 2:
				obj.displayEmployees();
				break;
			case 3:
				obj.employeeInsuranceScheme();
				break;
			case 4:
				obj.removeEmployee();
				break;
			case 0:
				System.exit(0);
				
			}
			
		}

	}
	
	public static void insertEmp() {
		System.out.println("Enter id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Salary");
		int salary = Integer.parseInt(sc.nextLine());
		System.out.println("Enter designation System Associate/Programmer/Manager/Clerk: ");
		String designation = sc.nextLine();
		try {
			esi.insertEmployee(new Employee(id, name, salary, designation));
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	
	public void displayEmployees()
	{
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = esi.getAllEmployees();
		
		iterateEmployeeList(empList);
		
	}
	
	public void display_Employee(Employee e)
	{
		System.out.println(" Name : "+e.getName());
		System.out.println(" ID : "+e.getId());
		System.out.println(" Salary : "+e.getSalary());
		System.out.println(" Designation : "+e.getDesignation());
		System.out.println(" Insurance Scheme : "+e.getInsuranceScheme());
		System.out.println("\n---------------------------------------------\n");
		
		
	}
	
	
	public void employeeInsuranceScheme() {
		System.out.println("Enter insurance scheme");
		String insurance = sc.nextLine();
		List<Employee> empList = esi.getAllEmployeesByInsurance(insurance);
		//List<Employee> empList = esi.getAllEmployees();
		iterateEmployeeList(empList);
		
		
	}
	
	public void removeEmployee() {
		System.out.println("Enter Id: ");
		int rid = Integer.parseInt(sc.nextLine());
		String rname = sc.nextLine();
		esi.deleteEmployee(rid, rname);
		
	}
	
	public void iterateEmployeeList(List<Employee> empList) {
		
		for (Employee employee : empList) {
			display_Employee(employee);
		}

		
	}

}