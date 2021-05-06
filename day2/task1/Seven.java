package day2.task1;

import java.util.Scanner;

public class Seven {
	static boolean checkNumber(int n) {
		int pr = n%10;
		n /= 10;
		boolean f = true;
		while(n > 0) {
			int r = n%10;
			if(pr < r) {
				f = false;
				break;
			}
			n /= 10;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number upto which you want to calculate: ");
		int n = sc.nextInt();
		System.out.println("Is it an increasing number: " + checkNumber(n));
	}

}
