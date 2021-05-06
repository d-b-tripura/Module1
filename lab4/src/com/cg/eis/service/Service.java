package com.cg.eis.service;
import com.cg.eis.pl.EmployeeApp;

public class Service implements EmployeeService {
	
	EmployeeApp e = new EmployeeApp();
	
	@Override
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		e.getUserInputs();
		
	}

	@Override
	public void findInsuranceScheme() {
		// TODO Auto-generated method stub
		e.insuranceSchemeIs();
		
	}

	@Override
	public void printEmployeeDetails() {
		// TODO Auto-generated method stub
		e.printUserDetails();
	}

	
}
