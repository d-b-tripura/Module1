package lab3;

import java.util.Scanner;

public class Exercise8 {
	public static boolean isPositive(String s) {
		boolean b = true;
		char ch = s.charAt(0);
		for(int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c <= ch) {
				b = false;
				break;
			}
			ch = c;
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.next();
		System.out.println(isPositive(s.toUpperCase()));
	}

}
