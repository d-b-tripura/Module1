package day3.task1;
import java.util.*;
public class Dog_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Dog d = new Dog();
		d.setName("Tony");
		d.setAge(2);
		d.setWeight(1);
		while(true) {
			System.out.println("Choose Function\n1. Feed the Dog\n2. Play Games With the dog\n3. Exit\nEnter choice: ");
			int n = sc.nextInt();
			switch(n) {
				case 1:
					d.doFeedAnimal();
					System.out.println("Weight after feeding is: " + d.getWeight());
					break;
				case 2:
					int w = d.getWeight();
					if(w < 2 || w > 30) {
						System.out.println("Cannot play games");
					} else {
						System.out.println("Playing Games");
						d.playGames();
						System.out.println("Weight after playing is: " + d.getWeight());
					}
					
					break;
				case 3:
					System.exit(0);
			}
		}

	}

}
