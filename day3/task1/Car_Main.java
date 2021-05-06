package day3.task1;

public class Car_Main {
	String brand;
	int mileage;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Car c1 = new Car(20);
		Car c2 = new Car("Maruti");
		c.setStartCar(1);
		System.out.println(c.getStartCar());
		
	}

}
