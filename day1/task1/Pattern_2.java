package day1.task1;
import java.util.*;
public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < ((i*2)+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
