package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.goods.ThingFactory;

public class MainTest {

	public static void main(String[] args) {
	
		Factory factory = new ThingFactory();
		Product p1 = factory.create("TV");
		Product p2 = factory.create("냉장고");
		
		p1.use();	
		p2.use();	
		
	
	}

}
