package models;

public class Product {
	
	private long id;
	private String name;
	private Double price;
	private ProductCategory productCategory;
	
	
	public Product(long id, String name, Double price, ProductCategory productCategory) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.productCategory = productCategory;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public ProductCategory getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	
	
	
	
}
