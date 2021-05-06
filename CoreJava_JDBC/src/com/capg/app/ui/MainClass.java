package com.capg.app.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.app.beans.Instructor;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.service.InstructorService;
import com.capg.app.service.InstructorServiceImpl;

public class MainClass {
	
	
	InstructorService service;
	
	public MainClass() {
		service = new InstructorServiceImpl();
	}
	
	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("1. Insert");
			System.out.println("2. Show All");
			System.out.println("3. Show Instructor by Id");
			System.out.println("4. Show Instructors by Location");
			System.out.println("5. Show All Instructors by salary low to high");
			System.out.println("6. Delete by Id");
			System.out.println("7. Instructor count at different locations");
			System.out.println("0. EXIT");
			
		
			
			int opt = new Scanner(System.in).nextInt(); 
			
			
			if(opt == 1)
			{
				obj.insertInstructorDetailsFromUser();
			}
			if(opt == 2)
			{
				
				obj.readInstructorDetails();
			}
			if(opt == 3) {
				obj.readInstructorDetailsByCode();
			}
			if(opt == 4) {
				obj.readInstructorDetailsByLocation();
			}
			if(opt == 5) {
				obj.readInstructorDetailsBySalary();
			}
			if(opt == 6) {
				obj.deleteInstructorDetailsByCode();
			}
			if(opt == 7) {
				obj.findInstructorCountByLocation();
			}
			
			if(opt == 0)
			{
				System.exit(0);
			}
			
			
		}
		
		
	}//end main
	
	public void insertInstructorDetailsFromUser()
	{
		System.out.println("Inside insert_Main");
		// ... write code to read data hope 
		Instructor instructor = new Instructor(134, "P", 3500, 2011, "H", "p@x.com");
		try {
			boolean result = service.insertInstructor(instructor);
			
			if(result) System.out.println(" Instructor Added");
			else System.out.println("Contact Admin ...");
		} catch (Exception e) {
			showErr(e);
		}
		
		
	}
	public void readInstructorDetails()
	{
		
		try
		{
			List<Instructor> list = service.getInstructors() ;
			
			list.stream().forEach(instructor->displayInstructor(instructor));
		}
		catch(Exception e)
		{
			showErr(e);
		}
	
	}
	
	public void readInstructorDetailsByCode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Instructor code: ");
		int code = Integer.parseInt(sc.next());
		try
		{
			Instructor instructor = service.getInstructorByCode(code);
			
			displayInstructor(instructor);
		}
		catch(Exception e)
		{
			showErr(e);
		}
	
	}
	
	public void readInstructorDetailsByLocation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Instructors Location: ");
		String location = sc.next();
		try
		{
			List<Instructor> list = service.getInstructorsByLocation(location);
			
			list.stream().forEach(instructor->displayInstructor(instructor));
		}
		catch(Exception e)
		{
			showErr(e);
		}
	
	}
	
	
	public void readInstructorDetailsBySalary()
	{
		
		try
		{
			List<Instructor> list = service.getInstructorsBySalary() ;
			
			list.stream().forEach(instructor->displayInstructor(instructor));
		}
		catch(Exception e)
		{
			showErr(e);
		}
	
	}
	
	
	public void findInstructorCountByLocation()
	{
		
		try
		{
			List<InstructorsLocationCountDTO> list = service.getInstructorsCountByLocation() ;
			list.stream().forEach(instructorLocationCount->displayInstructor(instructorLocationCount));
			
		}
		catch(Exception e)
		{
			showErr(e);
		}
	
	}
	public void displayInstructor(InstructorsLocationCountDTO instructor)
	{
		
		System.out.println(instructor.getLocation() + " " + instructor.getCount());
		System.out.println("-------------------------------------------------------");
	}
	
	public void displayInstructor(Instructor instructor)
	{
		
		System.out.println(instructor);
		System.out.println("-------------------------------------------------------");
	}
	public void showErr(Exception e)
	{
		System.out.println("====>> "+e);
	}
	
	
	public void deleteInstructorDetailsByCode()
	{
		//System.out.println("Inside insert_Main");
		// ... write code to read data hope 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Instructor Code: ");
		int code = Integer.parseInt(sc.next());
		try {
			boolean result = service.delteInstructorByCode(code);
			
			if(result) System.out.println(" Instructor Deleted");
			else System.out.println("Contact Admin ...");
		} catch (Exception e) {
			showErr(e);
		}
		
		
	}

}//end class