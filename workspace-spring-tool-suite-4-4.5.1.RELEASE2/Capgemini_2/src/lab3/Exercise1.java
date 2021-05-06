package lab3;
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		int sum = 0;
		System.out.println("Numbers are");
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			System.out.println(n);
			sum += n;
		}
		System.out.println("Sum is: " + sum);
	}

}
