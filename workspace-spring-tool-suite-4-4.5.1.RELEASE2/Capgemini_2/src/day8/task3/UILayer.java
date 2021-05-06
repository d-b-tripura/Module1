package day8.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class UILayer {
	public static void main(String[] args) {
		
		UILayer ecomApp = new UILayer();
		
		Product hpLaptop1 = new Product();
		hpLaptop1.setProductName("HP-Laptop-123");
		hpLaptop1.setCost(2000);
		hpLaptop1.setStarRating(3);
		hpLaptop1.setReviewCount(1001);
		
		Product dellLaptop = new Product();
		dellLaptop.setProductName("Dell-Laptop-123");
		dellLaptop.setCost(2200);
		dellLaptop.setStarRating(5);
		dellLaptop.setReviewCount(12001);
		
		Product apple1 = new Product();
		apple1.setProductName("Apple-Laptop-123");
		apple1.setCost(5000);
		apple1.setStarRating(4);
		apple1.setReviewCount(501);
		
		Product hp2 = new Product();
		hp2.setProductName("HP-Laptop-34123");
		hp2.setCost(12000);
		hp2.setStarRating(4);
		hp2.setReviewCount(5001);
		
	
		TreeSet<Product> set = new TreeSet<>();
		set.add(hpLaptop1);
		set.add(dellLaptop);
		set.add(apple1);
		set.add(hp2);
		
		
		
		ecomApp.defaultList(set);
		ecomApp.productHighToLowCost(set);
		ecomApp.productLowToHighCost(set);
		ecomApp.ratingHighToLow(set);
		ecomApp.reviewCountHighToLow(set);
		
		
		
	}

	// -----------------  HTML Code <Render on CLient's Browser>----------------
	public void displayProductList(List<Product> productList,String tagline)
	{
		System.out.println("\n\n ================= "+tagline+" ==================\n");
	
		for (Product product : productList) {
			System.out.println(product);
			System.out.println("---------------------------");
		}
	}
	
	public void defaultList(TreeSet<Product> productSet)
	{
		List<Product> list = new ArrayList<>();
		list.addAll(productSet);
		displayProductList(list, "List of Laptops");  // sending response from server
	}
	
	public void productHighToLowCost(TreeSet<Product> productSet)
	{
		List<Product> list = new ArrayList<>();
		list.addAll(productSet);
		Collections.sort(list,new ProductHighToLow());
		displayProductList(list, "List of Laptops High To Low Cost");  // sending response from server
	}
	
	public void productLowToHighCost(TreeSet<Product> productSet)
	{
		List<Product> list = new ArrayList<>();
		list.addAll(productSet);
		Collections.sort(list,new ProductLowToHigh());
		displayProductList(list, "List of Laptops Low To High Cost");  // sending response from server
	}
	public void ratingHighToLow(TreeSet<Product> productSet)
	{
		List<Product> list = new ArrayList<>();
		list.addAll(productSet);
		Collections.sort(list,new RatingHighToLow());
		displayProductList(list, "List of Laptops High To Low Rating");  // sending response from server
	}
	public void reviewCountHighToLow(TreeSet<Product> productSet)
	{
		List<Product> list = new ArrayList<>();
		list.addAll(productSet);
		Collections.sort(list,new ReviewCountHighToLow());
		displayProductList(list, "List of Laptops High To Low Rating");  // sending response from server
	}
	
}//end class
