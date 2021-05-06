package day5.task1;

public class AnimalGameApp {

	public static void main(String[] args) {
		
		AnimalGameApp app=  new AnimalGameApp();
		
		// Animal a = new Dog(); // downcasting 
		
		
		Dog dog = new Dog(4,20f);
		app.doAnimalThings(dog, 2);
		
		System.out.println(" ------------------------");
		
		Cat cat = new Cat(4,8f);
		app.doAnimalThings(cat, 2);
		
		Tiger tiger = new Tiger(4, 30f);
		app.doAnimalThings(tiger, 1);
	
	}
	
	public void doAnimalThings(Animal a,int food)
	{
		a.doWalk();
		a.doFeed(food);
		// ----------  instanceOf ----
		if(a instanceof Dog)  
			{
			   // call all dog related things
				
				Dog d = (Dog)a; // upcasting 
				d.doPlayGames();
				
				/*
				 New Object creation will not work , becoz of state management
				Dog abc = new Dog();
				abc.doPlayGames(); 
				*/
			}
		if (a instanceof Cat )
			{
				Cat cat = (Cat)a;
				cat.doCatThings();
			}
		if (a instanceof Tiger )
		{
			Tiger tiger = (Tiger)a;
			tiger.doThingSpecificThings();
		}
		
	}
}
