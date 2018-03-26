package day08_0308;

public class Product {
	
	static int count = 0;
	
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	
	public Product(){ // 기본 생성자, 생략가능 
		
	}
	
	Product(int num){
		this.serialNo = num;
	}
	
	void print(){
		System.out.printf("Product[No : %d] %n", serialNo);
	}

}

