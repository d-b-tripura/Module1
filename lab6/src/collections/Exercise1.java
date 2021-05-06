package collections;
import java.util.*;

public class Exercise1 {
	
	public static List sortByValue(HashMap<String, Integer> map) {
		 List list = new LinkedList(map.entrySet());
	        // Defined Custom Comparator here
	        Collections.sort(list, new Comparator() {
	             public int compare(Object o1, Object o2) {
	                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
	             }
	        });
			return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();

        map.put("vaishnavi", 10);
        map.put("sachin", 30);
        map.put("sahiti", 20);
        List<?> list = sortByValue(map);
        System.out.println(list);
        
	}

}
