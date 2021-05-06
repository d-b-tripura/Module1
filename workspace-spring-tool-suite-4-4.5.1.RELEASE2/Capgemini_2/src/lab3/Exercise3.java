package lab3;

import java.util.Scanner;

public class Exercise3 {

	public static String alterString(String s) {
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			char ch = c[i];
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
				if(ch == 'z') {
					c[i] = 'a';
				} else if(ch == 'Z') {
					c[i] = 'A';
				} else {
					c[i] = (char)(ch + 1);
				}
			}
			
		}
		
		return String.valueOf(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.next();
		System.out.println(alterString(s));
	}

}
