package day10_0312;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	/*void buy(Phone p){
		System.out.println("Phone 무료증정");
	}*/

	void buy(Object obj){
		if(! (obj instanceof Product)){
			System.out.println("구매 불가능");
			return;
		}
		Product p = (Product)obj;
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
//		System.out.println(p + "을 구입하셨습니다.");
		
		if(p instanceof TV){
			System.out.println("TV 구매");
		}else if(p instanceof Computer){
			System.out.println("Computer 구매");		
		}/*else if(p instanceof Phone){
			System.out.println("Phone 증정");
		}*/
	}
}
