package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.*;

public class EmployeeApp {
	
	Employee e = new Employee();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService es = new Service();
		es.getEmployeeDetails();
		es.findInsuranceScheme();
		es.printEmployeeDetails();
	}
	
	public void getUserInputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		String id = sc.nextLine();
		e.setId(Integer.parseInt(id));
		System.out.println("Enter name:");
		String name = sc.nextLine();
		e.setName(name);
		//System.out.println();
		System.out.println("Enter salary:");
		String salary = sc.nextLine();
		e.setSalary(Integer.parseInt(salary));
		System.out.println("Enter designation:");
		String designation = sc.nextLine();
		e.setDesignation(designation);
		sc.close();
	}
	
	public void insuranceSchemeIs() {
		if(e.getSalary()<10000 && e.getDesignation().equals("manager")) {
			e.setInsuranceScheme("ABC");
		}
		else {
			e.setInsuranceScheme("PQR");
		}
	}
	
	public void printUserDetails() {
		System.out.println(e.getId() + "\n" + e.getName() + "\n" + e.getSalary() + "\n" + e.getDesignation());
		System.out.println("InsuranceScheme is " + e.getInsuranceScheme());
	}

}
