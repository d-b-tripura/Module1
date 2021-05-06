package io;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDemo2 {
	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Dell\\Documents\\abc.txt");
		File f2 = new File("C:\\Users\\Dell\\Documents\\workspace-spring-tool-suite-4-4.5.1.RELEASE\\capgemini\\src\\io\\FileDemo2.java");
		FileDemo2 obj = new FileDemo2();
		
		try {
			//obj.doWriteOnFile(f);
			obj.doReadFromFile(f2);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void doReadFromFile(File f)throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = "";
		int count = 0;
		int lineNumber = 1;
		while((line = br.readLine())!=null)
		{
		/*	System.out.println(lineNumber+" "+line);
			boolean b = line.contains("file") || line.contains("File");
			
			if(b)
				{
					// spilt based on regexp for File input
					count++;
					System.out.println("----->> line Number "+lineNumber+" & count "+count);
				}
			*/
			String patt = "[file File]+";
			Matcher m = Pattern.compile(patt).matcher(line);
			if (m.find()) {
				count++;
			    System.out.println(lineNumber + ". " + line);
			}
			
			
			lineNumber++;
		}
		
		System.out.println("\n\n\n====>> File count "+count);
	}
	
	
	public void doWriteOnFile(File f)throws IOException
	{
		PrintWriter pw = new PrintWriter(new FileWriter(f));
		
		pw.append("gbfbfgnbgrfbnrgf");
	
		System.out.println("------------- Done ------------");
		pw.close();
	}

}