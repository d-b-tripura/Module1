package com.igate.labs;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
	
	public void salarySum() {
		EmployeeRepository er = new EmployeeRepository();
		List<Employee> emp = er.getEmployees();
		System.out.println("Sum: " + emp.stream().map(Employee->Employee.getSalary()).reduce(0.0, (ans, i) -> ans+i));
	}
	
/*	public void departmentCount() {
		EmployeeRepository er = new EmployeeRepository();
		List<Employee> list = er.getEmployees();
		//List<Employee> list1 = list.getDepartment();
		// Map<Department, Long> employeeCountByDepartment = list.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, TreeMap::new, Collectors.counting()));
		 //employeeCountByDepartment.forEach((department, count) -> System.out.printf("%s has %d employee(s)%n", department, count));
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService e = new EmployeeService();
		e.salarySum();
		//e.departmentCount();

	}

}
