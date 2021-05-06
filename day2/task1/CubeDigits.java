package day2.task1;
import java.util.*;
public class CubeDigits {

	static int sumOfCubesOfDigits(int n) {
		int sum = 0;
		while(n > 0) {
			int r = n%10;
			sum += (r*r*r);
			n /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("Sum is: " + sumOfCubesOfDigits(n));
	}

}
