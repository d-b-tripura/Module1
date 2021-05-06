package day8.task3;

import java.util.Comparator;

public class ProductHighToLow implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o2.getCost() - o1.getCost();
	}

	
}