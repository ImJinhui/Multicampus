package iterator;

import iterator.book.Book;
import iterator.fruit.Basket;
import iterator.fruit.Fruit;
import iterator.interfaces.IteratorM;

// 과일 예문으로 iterator 
public class MainAnswer {
	public static void main(String[] args) {

		Basket basket = new Basket(5);

		basket.appendFruit(new Fruit("사과"));
		basket.appendFruit(new Fruit("포도"));
		basket.appendFruit(new Fruit("바나나"));
		basket.appendFruit(new Fruit("딸기"));
		basket.appendFruit(new Fruit("메론"));
		
		IteratorM it = basket.iterator();
		while(it.hasNext()){
			Fruit fruit = (Fruit)it.next();
			System.out.println(fruit.getCate());
		}
		
	}
}
