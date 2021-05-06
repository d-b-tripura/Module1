package collections1;

import java.util.*;

public class Test {

	HashSet<Product> set = new HashSet<>();
	
	public void insert() {
		Product p1 = new Product("HP-Laptop", 20000, 5);
		Product p2 = new Product("Dell-Laptop", 30000, 5);
		Product p3 = new Product("Apple-Laptop", 25000, 5);
		Product p4 = new Product("HP-Laptop", 40000, 5);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
	}
	
	public void range(int low, int high) {
		for(Product i : set){
			if(i.getProductCost() >= low && i.getProductCost() <= high) {
				System.out.println(i.getProductName());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.insert();
		t.range(20000, 31000);
		
	}

}
