package day2.task1;

import java.util.*;

public class ArraysFour {

	static int j = 0;
	static int[] modifyArray(int arr[], int n) {
		Arrays.sort(arr);
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] != arr[i+1]){
				arr[j++] = arr[i];
			}
		}
		if(arr[j] != arr[n-1])
			arr[j++] = arr[n-1];
		int l = j;
		while(l < n) {
			arr[l++] = 0; 
		}
		for (int i = 0; i < n-1; i++) {
            for (int k = 0; k < n-i-1; k++) {
                if (arr[k] < arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
    	}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Elements in array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("modified array: ");
		modifyArray(arr, n);
		for(int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
