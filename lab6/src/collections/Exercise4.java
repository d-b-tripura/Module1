package collections;

import java.util.*;

public class Exercise4 {
	
	public static HashMap getStudents(HashMap<String, Integer> hmap) {
		HashMap<String, String> hMap = new HashMap<>();
		for (Map.Entry e : hmap.entrySet()) {
			int m = (int)e.getValue();
            if(m > 69 && m < 80) {
            	hMap.put((String)e.getKey(), "Bronze");
            } else if(m > 79 && m < 90) {
            	hMap.put((String)e.getKey(), "Silver");
            } else {
            	if(m > 89 && m < 101) {
            		hMap.put((String)e.getKey(), "Gold");
            	}
            }
		}
		
		return hMap;
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
	    map.put("101", 70);
	    map.put("102", 81);
	    map.put("103", 92);
	    map.put("100", 52);
	    System.out.println(getStudents(map));
	}
}
