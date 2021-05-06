package day8.task3;

import java.util.Comparator;

public class ReviewCountHighToLow implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o2.getReviewCount() - o1.getReviewCount();
	}

}
