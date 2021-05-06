package stream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamMax {
	
	void sMax() {
		List<Integer> l = Arrays.asList(1, 2, 9, 6, 4, 7);
		int x = l.stream().max((i, j)->i.compareTo(j)).get();
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamMax sm = new StreamMax();
		sm.sMax();

	}

}
