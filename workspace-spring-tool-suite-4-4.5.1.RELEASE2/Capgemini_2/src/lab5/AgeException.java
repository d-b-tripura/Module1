package lab5;
public class AgeException extends Exception{

	int inputage ;
	String message;


	public AgeException(int inputAge) {
		
		this.inputage = inputAge;
		
	}


	@Override
	public String toString() {
		return " Age above 15 is Invalid "+inputage;
	}

}