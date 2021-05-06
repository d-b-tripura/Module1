package lab3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int l_count=0; 
		int w_count = 0;
		for(int i = 0; i < s.length(); i++) {    
			if(s.charAt(i) != ' ') {
				l_count++;    
			}
		}
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				w_count++;
			}
		}
		System.out.println("Number of letters : "+l_count);
		System.out.println("Number of Words : "+(w_count + 1));

	}

}
