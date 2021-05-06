package day2.task1;
import java.util.*;
public class Fibonacci {
	static void fib(int n) {
		int a = 1;
		int b = 1;
		while(n > 0) {
			int t = a+b;
			a = b;
			b = t;
			n--;
		}
		System.out.println(a);
	}
	static int fib_rec(int n) {
		if (n <= 1)
	        return n;
	    return fib_rec(n-1) + fib_rec(n-2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of sequence");
		int n = sc.nextInt();
		System.out.println("Without using recursion");
		fib(n-1);
		System.out.println("Using recursion");
		System.out.println(fib_rec(n));
	}

}
