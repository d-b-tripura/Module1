package Strings;

//import java.lang.*;
public class StringFunc {

	public static void main(String args[]) {
		String s = " I love to read books   "; 
		System.out.println(s.trim());
		
		
		String Str = new String("Welcome to Capgemini");
        System.out.print("The extracted substring is : ");
        System.out.println(Str.substring(10));
        System.out.println(s.trim().substring(15));
        
        
        String s1 = "Hi!";
        s1 = s1.concat(" How are you?");
        System.out.println(s1);
        
        StringBuffer sbf = new StringBuffer("How old are you? I am ");
        sbf.append("21.");
        System.out.println(sbf);
    
        String str_split="split method. It is cool - (Hello-World)";
        
        for (String str_complex : str_split.split("\\s|,|\\.|-")) {
            System.out.print(str_complex);
        }
        System.out.println();
        String[] str1 = str_split.split("\\(|\\)");
        System.out.println();
    }

}
