package day8.task3;

import java.util.Comparator;

public class RatingHighToLow implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o2.getStarRating() - o1.getStarRating();
	}
}
