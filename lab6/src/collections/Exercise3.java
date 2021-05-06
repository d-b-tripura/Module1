package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise3 {
	
	public static HashMap getSquares(int[] a) {
		HashMap <Integer, Integer> hMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (hMap.containsKey(a[i]) == false){
				int n = a[i];
			    hMap.put(a[i], n*n);
			    //System.out.println(hMap.get(a[i]));
			}
		}
		return hMap;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(getSquares(a));

	}


}
