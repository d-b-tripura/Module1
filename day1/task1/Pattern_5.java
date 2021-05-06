package day1.task1;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int r = sc.nextInt();
		int n = (r+1)/2;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			int m = ((i*2)+1);
			for(int j = 0; j < m; j++) {
				if(j == 0 || j == m-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = n-2; i > -1; i--) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			int m = ((i*2)+1);
			for(int j = 0; j < m; j++) {
				if(j == 0 || j == m-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
