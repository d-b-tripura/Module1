package day2.task1;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		for(int i = 2; i < n; i++) {
			int f = 0;
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					f = 1;
					break;
				}
			}
			if(f == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
