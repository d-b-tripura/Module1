package com.cg.eis.service;

import java.util.HashMap;
import java.util.List;

import com.cg.eis.bean.*;


public interface EmployeeService {
	//Interface variables are static, public and final
	
	public boolean insertEmployee(Employee e) throws EmployeeException;
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesByInsurance(String insurance);
	public List<Employee> deleteEmployee(int id, String name);

}