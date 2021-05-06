package day1.task1;

import java.util.Scanner;

public class Pattern_1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int n = sc.nextInt();
		int k = 2;
		int l = 1;
		for(int i = 0; i < n; i++) {
			for(int j =0; j <= i; j++) {
				if(i%2 == 0) {
					System.out.print(l + " ");
					l += 2;
				}
				else {
					System.out.print(k + " ");
					k += 2;
				}
			}
			System.out.println();
		}

	}

}
