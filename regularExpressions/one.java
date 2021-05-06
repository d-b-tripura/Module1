package regularExpressions;

import java.util.*;
import java.util.regex.*;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Pattern p = Pattern.compile("[A-Z][1-4]{6}");
		Matcher m = p.matcher(s);
		System.out.println(m.find());
		
		//Pattern p = Pattern.compile("[A-Za-z]+[A-Za-z0-9][._]{1}[A-Za-z0-9][@][A-Za-z][.][A-Za-z]");
				/*
				* ? : 1 or 0
				* + : more than 1
				* * : 0 or more
				* . : any char
				*
				* [abc] : a or b or c
				* [a-z A-Z] : a to z or A to Z
				* [^abc] : any char but not a/b/c
				*
				* {n} : n times
				* {n,m} : min n times and max m times
				*
				* && : apply this rule
				*
				* */

			//	Pattern p = Pattern.compile("[A-Z[^l-q]]{3}");
			//	Matcher m = p.matcher("abm");
			//	System.out.println(m.matches());

		
	}

}
