package collections1;

import java.time.LocalDate;

public class Product {
	private String productName;
	private int productCost;
	private int startRating;
	private LocalDate manifacturingDate;
	
	public Product(String productName, int productCost, int startRating) {
		super();
		this.productName = productName;
		this.productCost = productCost;
		this.startRating = startRating;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public int getStartRating() {
		return startRating;
	}
	public void setStartRating(int startRating) {
		this.startRating = startRating;
	}
	public LocalDate getManifacturingDate() {
		return manifacturingDate;
	}
	public void setManifacturingDate(LocalDate manifacturingDate) {
		this.manifacturingDate = manifacturingDate;
	}
}

