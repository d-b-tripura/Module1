package day2.task1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOne {
		static int getSecondSmallest(int[] a) {
			Arrays.sort(a);
			return a[1];
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements in array: ");
			int n = sc.nextInt();
			System.out.println("Enter Array: ");
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("2nd smallest number: " + getSecondSmallest(a));
		}

}
