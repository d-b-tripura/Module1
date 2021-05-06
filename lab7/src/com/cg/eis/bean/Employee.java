package com.cg.eis.bean;


public class Employee {
	
	int id;
	String name;
	int salary;
	String designation;
	String insuranceScheme;
	//Project project;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, int salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	
	
	
	public Employee(int id, String name, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	

	@Override    //        (Animal a)
	public boolean equals(Object obj) {
		
		
		boolean isSame = false;
		// code to compare e1 and e2
		
		if(obj instanceof Employee)
		{
		  Employee e = (Employee)obj;	
		  
		 
		  boolean a = (this.id == e.id);
		  boolean b = (this.name.equals(e.name));
		  boolean c = this.salary == e.salary;
		  boolean d = this.designation.equals(e.designation);
		  boolean n = this.insuranceScheme.equals(e.insuranceScheme);
		  return a&&b&&c&&d&&n;
			
		}
		return isSame;
	}
	
	public int compareTo(Employee o) {
		return this.id - o.getId();
	}
	
}