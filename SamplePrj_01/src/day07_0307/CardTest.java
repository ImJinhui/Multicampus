package day07_0307;

public class CardTest {

	public static void main(String[] args) {
		
		Card[] cards = {};
		
		Card c1 = new Card();
		c1.kind = "Spade";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Heart";
		c2.number = 9;
		
		c1.print();
		c2.print();
				
	}

}
