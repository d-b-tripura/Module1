package lab3;

import java.util.Scanner;

public class Exercise2 {

	public static String mirrorImage(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return s + "|" + sb;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.next();
		System.out.println(mirrorImage(s));
	}

}
