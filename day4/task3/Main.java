package day4.task3;
import java.util.Scanner;

import day4.task1.Car;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Demo d1 = new Demo();
		Car c = new Car();
		while(true) {
			System.out.println("Enter your choice\n1. To insert\n2. To get car at given position\n3. To display list of cars");
			int choice = in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Give a name to your car");
				String name = in.next();
				c.setCarName(name);
				d1.insertCar(c);
				break;
			case 2:
				System.out.println("Enter the index of your choice");
				int ind = in.nextInt();
				d1.searchNumber(ind);
				break;
			case 3:
				if(d1.index ==0) {
					System.out.println("No cars available"); 
					break;
				} else {
					System.out.println("----List of Cars are---");
					d1.displayCars();
					break;
				}
			case 4:
				System.exit(0);
			}
		}	
	}
}