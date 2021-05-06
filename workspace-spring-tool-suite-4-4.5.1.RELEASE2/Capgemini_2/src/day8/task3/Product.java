package day8.task3;

public class Product implements Comparable<Product> {
	
	private String productName;
	private int cost;
	private int starRating;
	private int ReviewCount;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getStarRating() {
		return starRating;
	}
	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}
	public int getReviewCount() {
		return ReviewCount;
	}
	public void setReviewCount(int reviewCount) {
		ReviewCount = reviewCount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ReviewCount;
		result = prime * result + cost;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + starRating;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (ReviewCount != other.ReviewCount)
			return false;
		if (cost != other.cost)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (starRating != other.starRating)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Product o) {
		return this.getProductName().compareTo(o.getProductName());
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", cost=" + cost + ", starRating=" + starRating
				+ ", ReviewCount=" + ReviewCount + "]";
	}
	
	
	
	

}