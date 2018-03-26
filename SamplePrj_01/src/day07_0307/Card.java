package day07_0307;

public class Card {
	
	int number;
	String kind;
	
	static int width = 7;
	static int height = 15;
	
	public Card(){
		System.out.println("Card() 호출");
	}
	
	public void print(){
		System.out.printf("Card[%s, %d, (%d, %d)] \n",kind,number,width, height);
		return;
	}
	
	
}
