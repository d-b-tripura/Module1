package lab5;
public class NameException extends Exception{
	

	String name;

	public NameException(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name should not be null or empty "+name;
	}
	
	
}