package stream;
import java.util.stream.Stream;

public class Test {
	
	public void streamMethod() {
		Employee e = new Employee(102, "Anne");
		Employee e1 = new Employee(101, "lisanne");
		Stream<Employee> emp = Stream.of(e, e1);
		emp.forEach(s -> System.out.println(s));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.streamMethod();

	}

}
