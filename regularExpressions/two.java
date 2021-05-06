package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Pattern p = Pattern.compile("[A-Za-z]{3}\\d{4}");
		Matcher m = p.matcher(s);
		System.out.println(m.find());


	}

}
