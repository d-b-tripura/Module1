package day4.task1;

public class MainRunner {

	public static void main(String[] args) {
		
		Engine hondaEngine = new Engine(1000); // type of A
		Engine tataEngine = new Engine(1200);  // type B
		
		
		// --- default features-----
		//  ---- Base model ---
		Car car1 = new Car(hondaEngine);
		car1.moveCarForward();
		
		// ---- new enhancements in old component ---
		// ---- do some changes in base engine --
		Engine e = car1.getEngine();
		e.setBasepower(e.getBasepower()+1);
		car1.moveCarForward();
		
		//--- Switch to new component ---
		// --- change engine ---
		car1.setEngine(tataEngine);
		car1.moveCarForward();
		
		MusicSystem honda = new MusicSystem("petrol");
		MusicSystem maruti = new MusicSystem("diesel");
		MusicSystem ford = new MusicSystem("cng");
		Car car2 = new Car(honda);
		//car2.setMs(honda);
		car2.playMusic();
		car2.setMs(ford);
		car2.playMusic();
	}
}