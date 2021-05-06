package day2.task1;

import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Signals:\n 1. Red\n 2. Yellow\n 3. Green\nEnter the number of signal:");
		int n = sc.nextInt();
		switch(n) {
			case 1:
				System.out.println("Stop");
				break;
			case 2:
				System.out.println("Ready");
				break;
			case 3:
				System.out.println("Go");
		}
	}

}
