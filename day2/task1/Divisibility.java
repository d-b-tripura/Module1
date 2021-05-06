package day2.task1;

import java.util.Scanner;

public class Divisibility {

	static int calculateSum(int n) {
		int sum = 0;
		int num = 0;
		for(int i = 0; i < n; i++) {
			num += 15;
			sum += num;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum = calculateSum(n);
		
		System.out.println("The Sum is: " + sum);
	}

}
