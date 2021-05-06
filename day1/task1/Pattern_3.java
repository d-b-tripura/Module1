package day1.task1;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			int m = ((i*2)+1);
			for(int j = 0; j < m; j++) {
				if(i == 0 || i == n-1) {
					System.out.print("*");
				} else {
					if(j == 0 || j == m-1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
