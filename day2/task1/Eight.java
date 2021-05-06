package day2.task1;

import java.util.Scanner;

public class Eight {
		static boolean checkNumber(int n) {
			boolean f = false;
			int i = 1;
			while(i <= n) {
				i *= 2;
				if(i == n) {
					f = true;
				}
			}
			return f;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number you want to check: ");
			int n = sc.nextInt();
			System.out.println("Is it a power of 2: " + checkNumber(n));
		}


}
