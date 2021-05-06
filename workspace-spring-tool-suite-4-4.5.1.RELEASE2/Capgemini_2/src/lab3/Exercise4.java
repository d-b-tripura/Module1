package lab3;
import java.util.Scanner;

public class Exercise4 {
	
	public static int modifyNumber(int n) {
		String str = Integer.toString(n);
		String num = "";
		for(int i = 0;i < str.length();i++) {
			if(i <= str.length()-2) {
				char s1 = str.charAt(i);
				char s2 = str.charAt(i+1);
				int s = (Character.getNumericValue(s1) - Character.getNumericValue(s2));
				num += Math.abs(s);
			}else {
				num += Character.getNumericValue(str.charAt(i));
			}
		}
		int i = Integer.parseInt(num);  
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("The Modified number is:"+modifyNumber(n));
	}

}