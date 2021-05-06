package day5.task1;

public class Animal {

	int legs;
	float weight = 0;
	
	public Animal(int legs,float weight) {
		super();
		this.legs = legs;
		this.weight = weight;
	}

	public void doFeed(int food)
	{
		this.weight+= (food*0.10);
		System.out.println("animal class doFeed() "+weight);
	}
	
	public void doWalk()
	{
		System.out.println(" Animal Walk called :- Legs "+legs);
	}

}