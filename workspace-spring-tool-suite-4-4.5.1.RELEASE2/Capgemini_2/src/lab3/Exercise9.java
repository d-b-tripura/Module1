package lab3;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercise9 {

	public static void date() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in the format YYYY-MM-DD");
		String s = sc.next();
		LocalDate d = LocalDate.parse(s);
		System.out.println("Days: " + d.getDayOfMonth());
		System.out.println("Month: " + d.getMonth());
		System.out.println("Year: " + d.getYear());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date();

	}

}
