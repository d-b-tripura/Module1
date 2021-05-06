package lab5;

public class Person implements AutoCloseable{

	private int age;
	private String name;
	private int salary;
	
	public Person(int age, String name, int salary)
			throws AgeException,NameException, SalaryException
	{
		if(age<15)
		{
			throw new AgeException(age);
		}
		else this.age = age;
		
		if(name.isEmpty()||name == null||name.length()<1)
		{
			throw new NameException(name);
		}
		else this.name = name;
		if(salary<3000)
		{
			throw new SalaryException(salary);
		}
		else this.salary = salary;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		// how to close
	
	}
	
	
	
}//end main