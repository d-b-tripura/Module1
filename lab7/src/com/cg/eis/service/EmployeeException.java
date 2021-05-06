package com.cg.eis.service;
public class EmployeeException extends Exception{
	
	String insuranceScheme;

	public EmployeeException(String name) {
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return "Insurance Scheme should not be null or empty. It is: " + insuranceScheme;
	}
	


}