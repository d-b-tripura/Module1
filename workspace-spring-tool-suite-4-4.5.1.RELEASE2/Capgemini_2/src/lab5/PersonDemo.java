package lab5;
import java.io.File;
import java.io.PrintWriter;

public class PersonDemo {

	public static void main(String[] args) {
		
		//try(Person p = new Person(48, "sdcsdv"))
		//try(File f = new File("dcsd"))
		try//(PrintWriter pw = new PrintWriter(new File("")))
		{
			Person x = new Person(3, "R", 2000);
			System.out.println(x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
	}
}