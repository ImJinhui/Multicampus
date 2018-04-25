package test;

public abstract class Product {

	private int productId;
	private String description;
	private String producer;
	private int price;
	
	
	public Product() {
		super();
	}


	public Product(int productId, String description, String producer, int price) {
		super();
		this.productId = productId;
		this.description = description;
		this.producer = producer;
		this.price = price;
	}
	
	
	
	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getProducer() {
		return producer;
	}


	public void setProducer(String producer) {
		this.producer = producer;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	//
	public abstract void showInfo();
	
	
	
}
