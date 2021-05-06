package day2.task1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTwo {
	static String[] sortStrings(String[] a, int n) {
		Arrays.sort(a);
		for(int i = 0; i < n; i++) {
			int mid = (a[i].length() + 1)/2;
			String s1 = (a[i].substring(0, mid)).toUpperCase();
			String s2 = (a[i].substring(mid, a[i].length())).toLowerCase();
			a[i] = s1 + s2;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array: ");
		int n = sc.nextInt();
		System.out.println("Enter Array: ");
		String[] a = new String[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		sortStrings(a, n);
		
		System.out.println(Arrays.toString(a));
	}

}
