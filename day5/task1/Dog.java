package day5.task1;

public class Dog extends Animal{


	public Dog(int legs, float weight) {
		super(legs, weight);
		
	}

	public void doPlayGames()
	{
		System.out.println(" Dog play Games Called...");
	}

	
	public void doFeed(int food) {
		super.weight+= (food*0.25);
		System.out.println(" Inside dog implementation of feed method "+super.weight);
		
	}

	
	public void doWalk() {
		System.out.println(" Implementation of Dog walk method");
	}
	

	
}