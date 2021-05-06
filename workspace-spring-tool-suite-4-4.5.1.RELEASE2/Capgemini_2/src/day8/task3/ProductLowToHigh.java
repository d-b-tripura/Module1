package day8.task3;

import java.util.Comparator;

public class ProductLowToHigh implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getCost() - o2.getCost();
	}

	
}