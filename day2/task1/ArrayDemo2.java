package day2.task1;

import java.util.Scanner;

public class ArrayDemo2 {
	
	int arr[] = new int[3000];
	int index = 0;
	int indx = 0;
	public static void main(String[] args) {
		
		ArrayDemo2 obj = new ArrayDemo2();
		Scanner sc = new Scanner(System.in); // scanf() or cin>>
		
		
		while(true)
		{
			System.out.println("\n\n");
			System.out.println("============== Array Operation MENU ===============");
			System.out.println("1. Insert Data");
			System.out.println("2. Search Data");
			System.out.println("3. Print All Information.");
			System.out.println("4. Get Data By Index.");  // task 3  - 1min
			System.out.println("5. Delete Data");   ///    task1
			System.out.println("6. Print All Even Data"); // task 2  - 5min
			System.out.println("0. EXIT. ");
			
			System.out.println(" Enter option :- ");
			int option = sc.nextInt();
			
			switch(option)
			{
			
			case 1: 
					System.out.println(" Enter the data to be inserted :- ");
					obj.insertData(sc.nextInt());
					break;
					
			case 2:
				System.out.println(" Enter the data to be Searched :- ");
				int searchData = sc.nextInt();
				int pos = obj.searchData(searchData);
				if(pos!=-1)
				{
					System.out.println(searchData+" is at position "+(pos+1));
				}
				else
				{
					System.out.println(searchData+" Not available in the list. ");
				}
				
				break;
				   
			case 3: 
				
				obj.doPrintArray(obj.arr);
				break;
			case 4:
				System.out.println("Enter index value:- ");
				int ind = sc.nextInt();
				ind -= 1;
				System.out.println("Value at index is:- " + obj.getDataByIndex(ind));
				break;
			case 5:
				System.out.println("Enter element to be deleted:- ");
				int n = sc.nextInt();
				boolean deleteStatus = obj.delete(n);
				if(deleteStatus == true) {
					System.out.println("Successfully deleted");
				} else {
					System.out.println("Element not in array");
				}
				break;
			case 6:
				obj.printArray(obj.getAllEvenNumbers());
				break;
			case 0: System.exit(0);
			
			}//end switch
			
			
		}//end while
		
	}//end of main
	
	//----- method for create---
	public void insertData(int data)
	{
		arr[index++] = data;
	}
	
	
	// ----- method to view all data --
	
	public void doPrintArray(int ar[])
	{
		System.out.println(" ---------- Array Information ---------");
		for(int i = 0;i<index;i++)
		{
			System.out.print(" "+ar[i]);
		}
	}
	
	
	// method for search the data and return index position---
	public int searchData(int searchData)
	{
		for(int i = 0;i<index;i++)
		{
			// --- compare my searchData with data arr[index]
			if(arr[i] == searchData)
			{
				return i;
			}
		}
		// if we dont get data
		return -1;
	}
	
	
	// ---- method for get data from index and return data----
	public int getDataByIndex(int ind)
	{
		int data = arr[ind];
		return data;
	}
	
	// --- method for update Data and return status as boolean ---
	public boolean updateData(int newData,int index)
	{
		boolean isUpdated = false;
		
		arr[index] = newData;
		isUpdated = true;
		
		return isUpdated;
	}
	
	// ----- method to delete data from array and return status as boolean---
	
	public boolean delete(int data)
	{
		boolean isUpdated = false;
		
		// search the data 
		int position = searchData(data);
		if(position != -1) {
			for(int i = position; i < index; i++) {
				arr[i] = arr[i+1];
			}
			index -= 1;
			isUpdated = true;
		}
		
		// get position of data 
		
		
		// remove data from that position 
		return isUpdated;
	}
	
	// method to find even numbers from arr and insert into temp arr and return temp array
	
	public int[] getAllEvenNumbers()
	{
	
		// NOTE:- no print statement inside this block
		int n = arr.length;
		int[] arr1 = new int[n];
		for(int i = 0; i < index+1; i++) {
			if(arr[i]%2 == 0) {
				arr1[indx++] = arr[i];
			}
		}
		indx -= 1;
		return arr1;
	}
	
	public void printArray(int ar[])
	{
		System.out.println(" ---------- Array Information ---------");
		for(int i = 0;i<indx;i++)
		{
			System.out.print(" "+ar[i]);
		}
	}

}