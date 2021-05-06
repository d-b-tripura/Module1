package day2.task1;

import java.util.Scanner;

public class Six {

	static int calculateDifference(int n) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i < n+1; i++) {
			sum1 += i;
			sum2 += i*i;
		}
		int diff = (sum1*sum1) - sum2;
		return diff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number upto which you want to calculate: ");
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));

	}

}
