package day1.task1;
import java.util.*;
public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int n = sc.nextInt();
		int k = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(k + " ");
				k += 1;
			}
			System.out.println();
		}
		sc.close();
	}

}
