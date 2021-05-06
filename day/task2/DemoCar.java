package day.task2;

import day4.task1.Car;
import day4.task1.Engine;

public class DemoCar {
	private int count = 0;
	public static void main(String[] args) {
		Engine e1 = new Engine(800);
		Engine e2 = new Engine(1800);
		Car arr[] = new Car[3];
		Car obj1 = new Car(e1);
		obj1.setCarName("Honda");
		obj1.setCarPower(1000);
		Car obj2 = new Car(e2);
		Car obj3 = new Car(e1);
		obj2.setCarName("Maruti");
		obj2.setCarPower(1600);
		obj3.setCarName("Ford");
		obj3.setCarPower(1800);
		// insert into an array
		arr[0] = obj1;
		arr[1] = obj2;
		arr[2] = obj3;
		// ---- iterate the array
		// approach - 1
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getCarName()+" - "+arr[i].getCarPower());
		}
		System.out.println("-----------------------------------");
		// --- appraoch 2
		for (Car car : arr) {
			System.out.println(car.getCarName()+" --- "+car.getCarPower());
		}
		System.out.println("-----------------------------------");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getCarPower() > 1500) {
				System.out.println(arr[i].getCarName() + " - " + arr[i].getCarPower());
			}
		}
		Car cars[] = new Car[4];
		DemoCar d = new DemoCar();
		//d.addCars(cars);
	}
	
	/*public void addCars(Car cars) {
		cars[count] = new Car();
		cars[count++].setCarName(car.getCarName());
	}*/
}

