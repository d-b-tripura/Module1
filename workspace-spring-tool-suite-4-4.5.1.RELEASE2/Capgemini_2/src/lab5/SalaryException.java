package lab5;

public class SalaryException extends Exception{

	int salary;


	public SalaryException(int salary) {
		
		this.salary = salary;
		
	}


	@Override
	public String toString() {
		return " Salary should be above 3000. Current salary is: "+ salary;
	}

}
