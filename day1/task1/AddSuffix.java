package day1.task1;
import java.util.*;
public class AddSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date: ");
		int date = sc.nextInt();
		if(date > 0 && date < 32) {
			if((date > 3 && date < 21) || (date > 23 && date < 31)) {
				System.out.println("Date with suffix is: " + date + "th");
			} else if(date%10 == 1) {
				System.out.println("Date with suffix is: " + date + "st");
			} else if(date%10 == 2) {
				System.out.println("Date with suffix is: " + date + "nd");
			} else {
				System.out.println("Date with suffix is: " + date + "rd");
			}
		} else {
			System.out.println("Wrong date");
		}
	}

}
