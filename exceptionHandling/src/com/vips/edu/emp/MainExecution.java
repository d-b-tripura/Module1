package com.vips.edu.emp;
public class MainExecution {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();	
		for (String empid : codes) {
			System.out.println(empid);
		}

	}//end main
}//end