package day10_0312;

class Product {

	int price;
	int bonusPoint;
	
	public Product() {
		
	}
	
	Product (int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

}
