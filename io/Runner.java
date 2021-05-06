package io;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;


public class Runner {
	
	static HashMap<String, List<EmployeeParse>> hMap =  new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			ArrayList<EmployeeParse> empList = new ArrayList<EmployeeParse>() ;
		    File file = new File ( "C:\\Users\\Dell\\Downloads\\EmployeeRecord.txt") ;
		    Set<String> hash_Set = new HashSet<String>();
		    if ( file.exists() )   
		    {  
		    	Scanner inFile = new Scanner( file );
		    	inFile.useDelimiter("[\n]");
		        while ( inFile.hasNext() )
		        {
		        	String line = inFile.next() ;
		            line = line.trim().replaceAll("\n", "");
		            line = line.trim().replaceAll("\t", "");
		            line = line.trim().replaceAll(" ", "");
		            if ( line.length() > 0 ) {
		            	String delims = "[,]+";
		            	String[] tokens = line.split(delims);
		            	EmployeeParse emp = new EmployeeParse() ;
		            	emp.setId(Integer.parseInt(tokens[0]));		            	
		            	emp.setName(tokens[1]);
		            	emp.setCompany(tokens[2]);
		            	emp.setSalary(Integer.parseInt(tokens[3]));
		            	emp.setDept(tokens[4]);
		            	empList.add(emp) ;
		            	hash_Set.add(emp.getDept());
		            }
		        }

		        inFile.close();
		        for (String s : hash_Set) {
		        	List<EmployeeParse> list = new ArrayList<EmployeeParse>();
		            for(EmployeeParse e : empList) {
		            	if(e.getDept().equals(s)) {
		            		list.add(e);
		            	}
		            }
		            hMap.put(s, list);
		        }
		        
		    }
			else {
				System.out.println( "File Not Found");
			}
		    
		    
		    
		    Integer rec = 0 ;
		    for (EmployeeParse employee : empList) {
		    	System.out.println( "Employee-"+ ++rec +":");
				System.out.println( "ID = " + employee.getId());
				System.out.println( "Name = " + employee.getName());
				System.out.println( "Company = " + employee.getCompany());
				System.out.println( "Salary = " + employee.getSalary());
				System.out.println( "Department = " + employee.getDept());
				System.out.println();
			}
		    
		    System.out.println("Enter Department name IT/Sales/HR/Marketing:");
		    String d_name = sc.nextLine();
		    for (Entry<String, List<EmployeeParse>> el : hMap.entrySet()) {
				if(el.getKey().equals(d_name)) {
					List<EmployeeParse> lt = el.getValue();
					for (EmployeeParse empl : lt) {
						System.out.println( "ID = " + empl.getId());
						System.out.println( "Name = " + empl.getName());
						System.out.println( "Company = " + empl.getCompany());
						System.out.println( "Salary = " + empl.getSalary());
						System.out.println();
					}
					break;
				}
			}
		}
		catch ( FileNotFoundException e) {
			System.out.println( "File Not Found Exception");
		}

	}

}
