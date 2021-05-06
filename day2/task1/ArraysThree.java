package day2.task1;

import java.util.*;

public class ArraysThree {
	static int[] getSorted(int[] arr, int n) {
		for(int i = 0; i < arr.length; i++) {
			int rev = 0;
			while(arr[i] != 0) {
				int digit = arr[i] % 10;
				rev *= 10; 
				rev += digit;
				arr[i] /= 10;
			}
			arr[i] = rev;
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("Elements in array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Reversed and sorted array: ");
		getSorted(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
