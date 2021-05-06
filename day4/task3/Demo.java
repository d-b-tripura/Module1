package day4.task3;
import java.util.Scanner;

import day4.task1.Car;
public class Demo {
	int arr[] = new int[3];
	Car cars[] = new Car[3];
	
	
	static int index=0;
	
	public void insertCar(Car car) {
		cars[index] = new Car();
		cars[index++].setCarName(car.getCarName());
		
	}
	
	public void displayCars() {
		for(Car c: cars) {	
			System.out.println(c.getCarName());
		}
	}
	
	public void searchNumber(int searchNumber) {
		if(searchNumber >= cars.length || searchNumber <0)
			System.out.println("Index out of range"); 
		System.out.println("Car at position "+searchNumber +" is "+cars[searchNumber].getCarName());
		
	}
}